// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormListInAppResponseBody extends TeaModel {
    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("data")
    public java.util.List<GetFormListInAppResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetFormListInAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFormListInAppResponseBody self = new GetFormListInAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFormListInAppResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetFormListInAppResponseBody setData(java.util.List<GetFormListInAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFormListInAppResponseBodyData> getData() {
        return this.data;
    }

    public GetFormListInAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFormListInAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFormListInAppResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetFormListInAppResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetFormListInAppResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetFormListInAppResponseBodyDataTitle extends TeaModel {
        @NameInMap("EnUS")
        public String enUS;

        @NameInMap("ZhCN")
        public String zhCN;

        public static GetFormListInAppResponseBodyDataTitle build(java.util.Map<String, ?> map) throws Exception {
            GetFormListInAppResponseBodyDataTitle self = new GetFormListInAppResponseBodyDataTitle();
            return TeaModel.build(map, self);
        }

        public GetFormListInAppResponseBodyDataTitle setEnUS(String enUS) {
            this.enUS = enUS;
            return this;
        }
        public String getEnUS() {
            return this.enUS;
        }

        public GetFormListInAppResponseBodyDataTitle setZhCN(String zhCN) {
            this.zhCN = zhCN;
            return this;
        }
        public String getZhCN() {
            return this.zhCN;
        }

    }

    public static class GetFormListInAppResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("FormType")
        public String formType;

        @NameInMap("FormUuid")
        public String formUuid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Title")
        public GetFormListInAppResponseBodyDataTitle title;

        public static GetFormListInAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFormListInAppResponseBodyData self = new GetFormListInAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFormListInAppResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetFormListInAppResponseBodyData setFormType(String formType) {
            this.formType = formType;
            return this;
        }
        public String getFormType() {
            return this.formType;
        }

        public GetFormListInAppResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public GetFormListInAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetFormListInAppResponseBodyData setTitle(GetFormListInAppResponseBodyDataTitle title) {
            this.title = title;
            return this;
        }
        public GetFormListInAppResponseBodyDataTitle getTitle() {
            return this.title;
        }

    }

}
