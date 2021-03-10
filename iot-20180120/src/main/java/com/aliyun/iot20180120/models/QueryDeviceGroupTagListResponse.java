// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupTagListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceGroupTagListResponseData data;

    public static QueryDeviceGroupTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupTagListResponse self = new QueryDeviceGroupTagListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupTagListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupTagListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupTagListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupTagListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupTagListResponse setData(QueryDeviceGroupTagListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupTagListResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupTagListResponseDataGroupTagInfo extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static QueryDeviceGroupTagListResponseDataGroupTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseDataGroupTagInfo self = new QueryDeviceGroupTagListResponseDataGroupTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseDataGroupTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceGroupTagListResponseDataGroupTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceGroupTagListResponseData extends TeaModel {
        @NameInMap("GroupTagInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceGroupTagListResponseDataGroupTagInfo> groupTagInfo;

        public static QueryDeviceGroupTagListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseData self = new QueryDeviceGroupTagListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseData setGroupTagInfo(java.util.List<QueryDeviceGroupTagListResponseDataGroupTagInfo> groupTagInfo) {
            this.groupTagInfo = groupTagInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupTagListResponseDataGroupTagInfo> getGroupTagInfo() {
            return this.groupTagInfo;
        }

    }

}
