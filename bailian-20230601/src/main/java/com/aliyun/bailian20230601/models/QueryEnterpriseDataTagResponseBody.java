// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseDataTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryEnterpriseDataTagResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEnterpriseDataTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseDataTagResponseBody self = new QueryEnterpriseDataTagResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseDataTagResponseBody setData(java.util.List<QueryEnterpriseDataTagResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryEnterpriseDataTagResponseBodyData> getData() {
        return this.data;
    }

    public QueryEnterpriseDataTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryEnterpriseDataTagResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryEnterpriseDataTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnterpriseDataTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnterpriseDataTagResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static QueryEnterpriseDataTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseDataTagResponseBodyData self = new QueryEnterpriseDataTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseDataTagResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryEnterpriseDataTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public QueryEnterpriseDataTagResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
