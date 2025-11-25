// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTongyiConversationLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("CostTime")
    public String costTime;

    @NameInMap("Datas")
    public java.util.List<java.util.Map<String, ?>> datas;

    /**
     * <strong>example:</strong>
     * <p>28805A7C-D695-548C-A31B-67E52C2C274F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionFlowDebugInfo")
    public ListTongyiConversationLogsResponseBodySessionFlowDebugInfo sessionFlowDebugInfo;

    public static ListTongyiConversationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTongyiConversationLogsResponseBody self = new ListTongyiConversationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTongyiConversationLogsResponseBody setCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }
    public String getCostTime() {
        return this.costTime;
    }

    public ListTongyiConversationLogsResponseBody setDatas(java.util.List<java.util.Map<String, ?>> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    public ListTongyiConversationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTongyiConversationLogsResponseBody setSessionFlowDebugInfo(ListTongyiConversationLogsResponseBodySessionFlowDebugInfo sessionFlowDebugInfo) {
        this.sessionFlowDebugInfo = sessionFlowDebugInfo;
        return this;
    }
    public ListTongyiConversationLogsResponseBodySessionFlowDebugInfo getSessionFlowDebugInfo() {
        return this.sessionFlowDebugInfo;
    }

    public static class ListTongyiConversationLogsResponseBodySessionFlowDebugInfo extends TeaModel {
        @NameInMap("ApiParams")
        public java.util.Map<String, ?> apiParams;

        @NameInMap("SlotParams")
        public java.util.Map<String, ?> slotParams;

        public static ListTongyiConversationLogsResponseBodySessionFlowDebugInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTongyiConversationLogsResponseBodySessionFlowDebugInfo self = new ListTongyiConversationLogsResponseBodySessionFlowDebugInfo();
            return TeaModel.build(map, self);
        }

        public ListTongyiConversationLogsResponseBodySessionFlowDebugInfo setApiParams(java.util.Map<String, ?> apiParams) {
            this.apiParams = apiParams;
            return this;
        }
        public java.util.Map<String, ?> getApiParams() {
            return this.apiParams;
        }

        public ListTongyiConversationLogsResponseBodySessionFlowDebugInfo setSlotParams(java.util.Map<String, ?> slotParams) {
            this.slotParams = slotParams;
            return this;
        }
        public java.util.Map<String, ?> getSlotParams() {
            return this.slotParams;
        }

    }

}
