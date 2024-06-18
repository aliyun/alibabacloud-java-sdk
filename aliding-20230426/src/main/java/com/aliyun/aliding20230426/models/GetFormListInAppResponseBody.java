// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormListInAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("data")
    public java.util.List<GetFormListInAppResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>form</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>receipt</p>
         */
        @NameInMap("FormType")
        public String formType;

        /**
         * <strong>example:</strong>
         * <p>FORM-BAxxxxx</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>2023-02-22 15:27:07</p>
         */
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
