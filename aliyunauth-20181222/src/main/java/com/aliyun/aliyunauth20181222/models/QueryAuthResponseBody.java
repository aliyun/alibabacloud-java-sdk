// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class QueryAuthResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAuthResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthResponseBody self = new QueryAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAuthResponseBody setData(QueryAuthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAuthResponseBodyData getData() {
        return this.data;
    }

    public QueryAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAuthResponseBodyDataInfoDTOListInfoDTOList extends TeaModel {
        @NameInMap("AuthOrderVid")
        public String authOrderVid;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemRecordVid")
        public String itemRecordVid;

        @NameInMap("OperateCode")
        public String operateCode;

        public static QueryAuthResponseBodyDataInfoDTOListInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthResponseBodyDataInfoDTOListInfoDTOList self = new QueryAuthResponseBodyDataInfoDTOListInfoDTOList();
            return TeaModel.build(map, self);
        }

        public QueryAuthResponseBodyDataInfoDTOListInfoDTOList setAuthOrderVid(String authOrderVid) {
            this.authOrderVid = authOrderVid;
            return this;
        }
        public String getAuthOrderVid() {
            return this.authOrderVid;
        }

        public QueryAuthResponseBodyDataInfoDTOListInfoDTOList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryAuthResponseBodyDataInfoDTOListInfoDTOList setItemRecordVid(String itemRecordVid) {
            this.itemRecordVid = itemRecordVid;
            return this;
        }
        public String getItemRecordVid() {
            return this.itemRecordVid;
        }

        public QueryAuthResponseBodyDataInfoDTOListInfoDTOList setOperateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }
        public String getOperateCode() {
            return this.operateCode;
        }

    }

    public static class QueryAuthResponseBodyDataInfoDTOList extends TeaModel {
        @NameInMap("InfoDTOList")
        public java.util.List<QueryAuthResponseBodyDataInfoDTOListInfoDTOList> infoDTOList;

        public static QueryAuthResponseBodyDataInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthResponseBodyDataInfoDTOList self = new QueryAuthResponseBodyDataInfoDTOList();
            return TeaModel.build(map, self);
        }

        public QueryAuthResponseBodyDataInfoDTOList setInfoDTOList(java.util.List<QueryAuthResponseBodyDataInfoDTOListInfoDTOList> infoDTOList) {
            this.infoDTOList = infoDTOList;
            return this;
        }
        public java.util.List<QueryAuthResponseBodyDataInfoDTOListInfoDTOList> getInfoDTOList() {
            return this.infoDTOList;
        }

    }

    public static class QueryAuthResponseBodyData extends TeaModel {
        @NameInMap("InfoDTOList")
        public QueryAuthResponseBodyDataInfoDTOList infoDTOList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProductCode")
        public String productCode;

        public static QueryAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthResponseBodyData self = new QueryAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAuthResponseBodyData setInfoDTOList(QueryAuthResponseBodyDataInfoDTOList infoDTOList) {
            this.infoDTOList = infoDTOList;
            return this;
        }
        public QueryAuthResponseBodyDataInfoDTOList getInfoDTOList() {
            return this.infoDTOList;
        }

        public QueryAuthResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryAuthResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
