// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupTagListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceGroupTagListResponseBodyData data;

    public static QueryDeviceGroupTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupTagListResponseBody self = new QueryDeviceGroupTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupTagListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupTagListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupTagListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupTagListResponseBody setData(QueryDeviceGroupTagListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupTagListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupTagListResponseBodyDataGroupTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceGroupTagListResponseBodyDataGroupTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseBodyDataGroupTagInfo self = new QueryDeviceGroupTagListResponseBodyDataGroupTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseBodyDataGroupTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceGroupTagListResponseBodyDataGroupTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceGroupTagListResponseBodyData extends TeaModel {
        @NameInMap("GroupTagInfo")
        public java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> groupTagInfo;

        public static QueryDeviceGroupTagListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupTagListResponseBodyData self = new QueryDeviceGroupTagListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupTagListResponseBodyData setGroupTagInfo(java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> groupTagInfo) {
            this.groupTagInfo = groupTagInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupTagListResponseBodyDataGroupTagInfo> getGroupTagInfo() {
            return this.groupTagInfo;
        }

    }

}
