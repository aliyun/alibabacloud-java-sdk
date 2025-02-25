// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorsResponseBody extends TeaModel {
    /**
     * <p>Args</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetErrorsResponseBodyModel model;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>B3AD0FE4-36EF-1641-90B1-77618166F2ff</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetErrorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorsResponseBody self = new GetErrorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorsResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public GetErrorsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetErrorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErrorsResponseBody setModel(GetErrorsResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetErrorsResponseBodyModel getModel() {
        return this.model;
    }

    public GetErrorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErrorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetErrorsResponseBodyModelItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1740488561065</p>
         */
        @NameInMap("ClientTime")
        public Long clientTime;

        /**
         * <strong>example:</strong>
         * <p>RANDOM-1729634758587856312DEVICE</p>
         */
        @NameInMap("Did")
        public String did;

        /**
         * <p>Utdid</p>
         * 
         * <strong>example:</strong>
         * <p>RANDOM-1729634758587856312DEVICE</p>
         */
        @NameInMap("Utdid")
        public String utdid;

        /**
         * <strong>example:</strong>
         * <p>9634758587856312DEV</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetErrorsResponseBodyModelItems build(java.util.Map<String, ?> map) throws Exception {
            GetErrorsResponseBodyModelItems self = new GetErrorsResponseBodyModelItems();
            return TeaModel.build(map, self);
        }

        public GetErrorsResponseBodyModelItems setClientTime(Long clientTime) {
            this.clientTime = clientTime;
            return this;
        }
        public Long getClientTime() {
            return this.clientTime;
        }

        public GetErrorsResponseBodyModelItems setDid(String did) {
            this.did = did;
            return this;
        }
        public String getDid() {
            return this.did;
        }

        public GetErrorsResponseBodyModelItems setUtdid(String utdid) {
            this.utdid = utdid;
            return this;
        }
        public String getUtdid() {
            return this.utdid;
        }

        public GetErrorsResponseBodyModelItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetErrorsResponseBodyModel extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetErrorsResponseBodyModelItems> items;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pages")
        public Integer pages;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetErrorsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetErrorsResponseBodyModel self = new GetErrorsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetErrorsResponseBodyModel setItems(java.util.List<GetErrorsResponseBodyModelItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetErrorsResponseBodyModelItems> getItems() {
            return this.items;
        }

        public GetErrorsResponseBodyModel setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetErrorsResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetErrorsResponseBodyModel setPages(Integer pages) {
            this.pages = pages;
            return this;
        }
        public Integer getPages() {
            return this.pages;
        }

        public GetErrorsResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
