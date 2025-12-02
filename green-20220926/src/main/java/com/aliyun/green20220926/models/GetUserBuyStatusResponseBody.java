// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUserBuyStatusResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public GetUserBuyStatusResponseBodyData data;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. It can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUserBuyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserBuyStatusResponseBody self = new GetUserBuyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserBuyStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUserBuyStatusResponseBody setData(GetUserBuyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserBuyStatusResponseBodyData getData() {
        return this.data;
    }

    public GetUserBuyStatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetUserBuyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserBuyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserBuyStatusResponseBodyData extends TeaModel {
        /**
         * <p>Bid.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public Long bid;

        /**
         * <p>Indicates whether the product has been activated on Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Buy")
        public Boolean buy;

        /**
         * <p>Indicates whether there is an outstanding payment.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Indebt")
        public Boolean indebt;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Tag.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static GetUserBuyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserBuyStatusResponseBodyData self = new GetUserBuyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserBuyStatusResponseBodyData setBid(Long bid) {
            this.bid = bid;
            return this;
        }
        public Long getBid() {
            return this.bid;
        }

        public GetUserBuyStatusResponseBodyData setBuy(Boolean buy) {
            this.buy = buy;
            return this;
        }
        public Boolean getBuy() {
            return this.buy;
        }

        public GetUserBuyStatusResponseBodyData setIndebt(Boolean indebt) {
            this.indebt = indebt;
            return this;
        }
        public Boolean getIndebt() {
            return this.indebt;
        }

        public GetUserBuyStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserBuyStatusResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
