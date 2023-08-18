// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetHistoryAdvicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetHistoryAdvicesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHistoryAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryAdvicesResponseBody self = new GetHistoryAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryAdvicesResponseBody setData(GetHistoryAdvicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoryAdvicesResponseBodyData getData() {
        return this.data;
    }

    public GetHistoryAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistoryAdvicesResponseBodyDataResult extends TeaModel {
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Severity")
        public Integer severity;

        @NameInMap("Url")
        public String url;

        public static GetHistoryAdvicesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryAdvicesResponseBodyDataResult self = new GetHistoryAdvicesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetHistoryAdvicesResponseBodyDataResult setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public GetHistoryAdvicesResponseBodyDataResult setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public GetHistoryAdvicesResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHistoryAdvicesResponseBodyDataResult setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetHistoryAdvicesResponseBodyDataResult setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetHistoryAdvicesResponseBodyDataResult setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetHistoryAdvicesResponseBodyDataResult setSeverity(Integer severity) {
            this.severity = severity;
            return this;
        }
        public Integer getSeverity() {
            return this.severity;
        }

        public GetHistoryAdvicesResponseBodyDataResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetHistoryAdvicesResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("Result")
        public java.util.List<GetHistoryAdvicesResponseBodyDataResult> result;

        @NameInMap("Total")
        public Integer total;

        public static GetHistoryAdvicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryAdvicesResponseBodyData self = new GetHistoryAdvicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryAdvicesResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetHistoryAdvicesResponseBodyData setResult(java.util.List<GetHistoryAdvicesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetHistoryAdvicesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetHistoryAdvicesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
