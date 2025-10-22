// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckPushReceiverResponseBody extends TeaModel {
    @NameInMap("Module")
    public CheckPushReceiverResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>78C60CC3-FF0A-44E2-989A-DDE0597791C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckPushReceiverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPushReceiverResponseBody self = new CheckPushReceiverResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckPushReceiverResponseBody setModule(CheckPushReceiverResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckPushReceiverResponseBodyModule getModule() {
        return this.module;
    }

    public CheckPushReceiverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckPushReceiverResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanReceivePush")
        public Boolean canReceivePush;

        /**
         * <strong>example:</strong>
         * <p>130****8600</p>
         */
        @NameInMap("MaskedMobile")
        public String maskedMobile;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static CheckPushReceiverResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckPushReceiverResponseBodyModule self = new CheckPushReceiverResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckPushReceiverResponseBodyModule setCanReceivePush(Boolean canReceivePush) {
            this.canReceivePush = canReceivePush;
            return this;
        }
        public Boolean getCanReceivePush() {
            return this.canReceivePush;
        }

        public CheckPushReceiverResponseBodyModule setMaskedMobile(String maskedMobile) {
            this.maskedMobile = maskedMobile;
            return this;
        }
        public String getMaskedMobile() {
            return this.maskedMobile;
        }

        public CheckPushReceiverResponseBodyModule setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

}
