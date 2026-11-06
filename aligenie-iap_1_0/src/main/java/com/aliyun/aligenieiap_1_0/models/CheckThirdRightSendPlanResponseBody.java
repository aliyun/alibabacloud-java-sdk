// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CheckThirdRightSendPlanResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RetMsg")
    public String retMsg;

    /**
     * <p>Result of invoking the API</p>
     */
    @NameInMap("RetValue")
    public CheckThirdRightSendPlanResponseBodyRetValue retValue;

    public static CheckThirdRightSendPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckThirdRightSendPlanResponseBody self = new CheckThirdRightSendPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckThirdRightSendPlanResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public CheckThirdRightSendPlanResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public CheckThirdRightSendPlanResponseBody setRetValue(CheckThirdRightSendPlanResponseBodyRetValue retValue) {
        this.retValue = retValue;
        return this;
    }
    public CheckThirdRightSendPlanResponseBodyRetValue getRetValue() {
        return this.retValue;
    }

    public static class CheckThirdRightSendPlanResponseBodyRetValue extends TeaModel {
        /**
         * <p>Activation time</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1713262192005&quot;</p>
         */
        @NameInMap("ActivateDate")
        public String activateDate;

        /**
         * <p>Card type</p>
         * 
         * <strong>example:</strong>
         * <p>1001 日卡 1002 月卡 1003 季卡 1004 年卡</p>
         */
        @NameInMap("CardType")
        public Integer cardType;

        /**
         * <p>Channel code</p>
         * 
         * <strong>example:</strong>
         * <p>TB</p>
         */
        @NameInMap("ChannelCode")
        public String channelCode;

        /**
         * <p>Channel Name</p>
         * 
         * <strong>example:</strong>
         * <p>淘宝</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>Extension field</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>908FA068-529C-0C20-8DB5-63B0EF7CFF1F</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>Rights expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1713262192005&quot;</p>
         */
        @NameInMap("RightsExpiredDate")
        public String rightsExpiredDate;

        public static CheckThirdRightSendPlanResponseBodyRetValue build(java.util.Map<String, ?> map) throws Exception {
            CheckThirdRightSendPlanResponseBodyRetValue self = new CheckThirdRightSendPlanResponseBodyRetValue();
            return TeaModel.build(map, self);
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setCardType(Integer cardType) {
            this.cardType = cardType;
            return this;
        }
        public Integer getCardType() {
            return this.cardType;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CheckThirdRightSendPlanResponseBodyRetValue setRightsExpiredDate(String rightsExpiredDate) {
            this.rightsExpiredDate = rightsExpiredDate;
            return this;
        }
        public String getRightsExpiredDate() {
            return this.rightsExpiredDate;
        }

    }

}
