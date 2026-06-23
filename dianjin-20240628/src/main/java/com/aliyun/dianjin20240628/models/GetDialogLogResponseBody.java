// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogLogResponseBody extends TeaModel {
    /**
     * <p>The processing time.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetDialogLogResponseBodyData data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>051EEB18-049A-17FF-A5E0-14A5B127C798</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDialogLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDialogLogResponseBody self = new GetDialogLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDialogLogResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDialogLogResponseBody setData(GetDialogLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDialogLogResponseBodyData getData() {
        return this.data;
    }

    public GetDialogLogResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDialogLogResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDialogLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDialogLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDialogLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDialogLogResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDialogLogResponseBodyDataHitIntentionList extends TeaModel {
        /**
         * <p>A description of the customer\&quot;s intent.</p>
         * 
         * <strong>example:</strong>
         * <p>客户希望与真人接触，不想和AI客服继续对话。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>客户要求转人工</p>
         */
        @NameInMap("intentionName")
        public String intentionName;

        /**
         * <p>The scripted reply based on the customer\&quot;s intent.</p>
         * 
         * <strong>example:</strong>
         * <p>很抱歉，我这里无法直接为您转接，您可以拨打我司客服热线进行咨询。</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        public static GetDialogLogResponseBodyDataHitIntentionList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyDataHitIntentionList self = new GetDialogLogResponseBodyDataHitIntentionList();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyDataHitIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDialogLogResponseBodyDataHitIntentionList setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public GetDialogLogResponseBodyDataHitIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class GetDialogLogResponseBodyDataIntentionList extends TeaModel {
        /**
         * <p>The <code>description</code> field provides a detailed description of the user\&quot;s intent.</p>
         * 
         * <strong>example:</strong>
         * <p>客户明确表示投诉/退订/不要打电话/骂人等拒绝营销</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>客户明确表示拒绝营销</p>
         */
        @NameInMap("intentionName")
        public String intentionName;

        /**
         * <p>The <code>intentionScript</code> field contains the service agent\&quot;s reply script for the user\&quot;s intent.</p>
         * 
         * <strong>example:</strong>
         * <p>非常抱歉，给您带来了不好的体验。如您无需再接受我们的官方来电，请回复“我要退订”四个字！</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        public static GetDialogLogResponseBodyDataIntentionList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyDataIntentionList self = new GetDialogLogResponseBodyDataIntentionList();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyDataIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDialogLogResponseBodyDataIntentionList setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public GetDialogLogResponseBodyDataIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class GetDialogLogResponseBodyData extends TeaModel {
        /**
         * <p>The analysis process. This field has a value if the analysis process is enabled during the real-time conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>客户回答的内容与提供的意图列表描述均不匹配，没有表达出对账单、还款、天气或其他服务的具体需求或问题。</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>The <code>conversationList</code> field records the conversation content.</p>
         * 
         * <strong>example:</strong>
         * <p>##客服##:您好，请问是张三先生是吧？\n ##客户##:人工客服\n ##客服##:您好，我是2804，很高兴为您服务！\n ##客服##:您好，请问有什么可以帮到您？\n ##客户##:好的 谢谢\n</p>
         */
        @NameInMap("conversationList")
        public String conversationList;

        /**
         * <p>The list of hit intents.</p>
         */
        @NameInMap("hitIntentionList")
        public java.util.List<GetDialogLogResponseBodyDataHitIntentionList> hitIntentionList;

        /**
         * <p>The intent list.</p>
         */
        @NameInMap("intentionList")
        public java.util.List<GetDialogLogResponseBodyDataIntentionList> intentionList;

        /**
         * <p>The model processing time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1382</p>
         */
        @NameInMap("modelCostTime")
        public Long modelCostTime;

        /**
         * <p>The recall list.</p>
         * 
         * <strong>example:</strong>
         * <h2>Example:\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:暂时没有了。谢谢。\&quot;时，用户意图为：\&quot;客户想要挂断电话\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:哎你好。\&quot;时，用户意图为：\&quot;客户询问来电目的\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:我现在财务状况很好，谢谢关心。\&quot;时，用户意图为：\&quot;客户拒绝贷款\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:不用了，谢谢，不要再打电话了，谢谢。\&quot;时，用户意图为：\&quot;投诉/退订/不要打电话/骂人\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:你好。\&quot;时，用户意图为：\&quot;客户询问来电目的\&quot;</h2>
         */
        @NameInMap("recallList")
        public String recallList;

        public static GetDialogLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyData self = new GetDialogLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyData setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public GetDialogLogResponseBodyData setConversationList(String conversationList) {
            this.conversationList = conversationList;
            return this;
        }
        public String getConversationList() {
            return this.conversationList;
        }

        public GetDialogLogResponseBodyData setHitIntentionList(java.util.List<GetDialogLogResponseBodyDataHitIntentionList> hitIntentionList) {
            this.hitIntentionList = hitIntentionList;
            return this;
        }
        public java.util.List<GetDialogLogResponseBodyDataHitIntentionList> getHitIntentionList() {
            return this.hitIntentionList;
        }

        public GetDialogLogResponseBodyData setIntentionList(java.util.List<GetDialogLogResponseBodyDataIntentionList> intentionList) {
            this.intentionList = intentionList;
            return this;
        }
        public java.util.List<GetDialogLogResponseBodyDataIntentionList> getIntentionList() {
            return this.intentionList;
        }

        public GetDialogLogResponseBodyData setModelCostTime(Long modelCostTime) {
            this.modelCostTime = modelCostTime;
            return this;
        }
        public Long getModelCostTime() {
            return this.modelCostTime;
        }

        public GetDialogLogResponseBodyData setRecallList(String recallList) {
            this.recallList = recallList;
            return this;
        }
        public String getRecallList() {
            return this.recallList;
        }

    }

}
