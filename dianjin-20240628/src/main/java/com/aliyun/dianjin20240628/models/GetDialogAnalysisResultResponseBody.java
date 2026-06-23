// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogAnalysisResultResponseBody extends TeaModel {
    /**
     * <p>Processing time in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Response data</p>
     */
    @NameInMap("data")
    public GetDialogAnalysisResultResponseBodyData data;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>88A006F0-B565-53BA-B38A-DBDF9D0B2935</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDialogAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDialogAnalysisResultResponseBody self = new GetDialogAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDialogAnalysisResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDialogAnalysisResultResponseBody setData(GetDialogAnalysisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDialogAnalysisResultResponseBodyData getData() {
        return this.data;
    }

    public GetDialogAnalysisResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDialogAnalysisResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDialogAnalysisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDialogAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDialogAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDialogAnalysisResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels extends TeaModel {
        /**
         * <p>Label name</p>
         * 
         * <strong>example:</strong>
         * <p>额度不足</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Label value</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("value")
        public String value;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp extends TeaModel {
        /**
         * <p>Session execution plan</p>
         * 
         * <strong>example:</strong>
         * <ol>
         * <li>客服应再次确认客户的疑问是否已解决，特别是关于额度的具体数额。\n2. 如果客户仍有疑问，提供客服热线电话，建议客户直接拨打以获取更详细的帮助。\n3. 提醒客户检查短信中的链接，以便快速查看和操作。\n4. 记录此次通话中客户表现出的任何不适或不便，确保后续跟进时更加体贴。\n5. 发送一条包含操作指南的短信，确保客户能够轻松找到并使用服务。\n6. 结束通话前，再次感谢客户的支持，并表达希望客户早日康复的愿望。</li>
         * </ol>
         */
        @NameInMap("dialogExecPlan")
        public String dialogExecPlan;

        /**
         * <p>List of session labels</p>
         */
        @NameInMap("dialogLabels")
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels;

        /**
         * <p>Session open analysis</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dialogues&quot;: [
         *         {
         *             &quot;round&quot;: 1,
         *             &quot;result&quot;: [
         *                 {
         *                     &quot;key&quot;: &quot;对话主题&quot;,
         *                     &quot;value&quot;: &quot;XX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户反应&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户反应分析&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客服话术&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;本轮客服话术修改建议&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 }
         *             ]
         *         },
         *         {
         *             &quot;round&quot;: 2,
         *             &quot;result&quot;: [
         *                 {
         *                     &quot;key&quot;: &quot;对话主题&quot;,
         *                     &quot;value&quot;: &quot;XX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户反应&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户反应分析&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客服话术&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;本轮客服话术修改建议&quot;,
         *                     &quot;value&quot;: &quot;XXX&quot;
         *                 }
         *             ]
         *         }
         *     ],
         *   &quot;dialogOpenAnalysisStr&quot;:&quot;第一轮对话：对话主题-xx##客户反应-xx##客户反应分析-xx##客服话术-xx##本轮客服话术修改建议-xx
         * 第二轮对话：对话主题-xx##客户反应-xx##客户反应分析-xx##客服话术-xx##本轮客服话术修改建议-xx&quot;
         * }</p>
         */
        @NameInMap("dialogOpenAnalysis")
        public java.util.Map<String, ?> dialogOpenAnalysis;

        /**
         * <p>Session process analysis</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dialogues&quot;: [
         *         {
         *             &quot;round&quot;: 1,
         *             &quot;result&quot;: [
         *                 {
         *                     &quot;key&quot;: &quot;客服&quot;,
         *                     &quot;value&quot;: &quot;客服回应标签&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户&quot;,
         *                     &quot;value&quot;: &quot;客户回应态度标签&quot;
         *                 }
         *             ]
         *         },
         *         {
         *             &quot;round&quot;: 2,
         *             &quot;result&quot;: [
         *                 {
         *                     &quot;key&quot;: &quot;客服&quot;,
         *                     &quot;value&quot;: &quot;客服回应标签&quot;
         *                 },
         *                 {
         *                     &quot;key&quot;: &quot;客户&quot;,
         *                     &quot;value&quot;: &quot;客户回应态度标签&quot;
         *                 }
         *             ]
         *         }
         *     ],
         * &quot;dialogProcessAnalysisStr&quot;:&quot;第一轮对话：客服-客服回应标签，客户-客户回应态度标签
         * 第二轮对话：客服-客服回应标签，客户-客户回应态度标签&quot;
         * }</p>
         */
        @NameInMap("dialogProcessAnalysis")
        public java.util.Map<String, ?> dialogProcessAnalysis;

        /**
         * <p>Session SOP</p>
         * 
         * <strong>example:</strong>
         * <p>产品介绍</p>
         */
        @NameInMap("dialogSop")
        public String dialogSop;

        /**
         * <p>Session summary</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>是否有资金需求：不确定，客户未明确表示有无资金需求。\n- 是否有意向：不确定，客户未明确表达意向。\n- 是否可营销：不可营销，客户对客服的多次询问未表现出兴趣，且对话中提到因不适希望减少联系。\n- 待满足需求：客户希望了解具体的预审额度信息。</li>
         * </ul>
         */
        @NameInMap("dialogSummary")
        public String dialogSummary;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogExecPlan(String dialogExecPlan) {
            this.dialogExecPlan = dialogExecPlan;
            return this;
        }
        public String getDialogExecPlan() {
            return this.dialogExecPlan;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogLabels(java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels) {
            this.dialogLabels = dialogLabels;
            return this;
        }
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> getDialogLabels() {
            return this.dialogLabels;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogOpenAnalysis(java.util.Map<String, ?> dialogOpenAnalysis) {
            this.dialogOpenAnalysis = dialogOpenAnalysis;
            return this;
        }
        public java.util.Map<String, ?> getDialogOpenAnalysis() {
            return this.dialogOpenAnalysis;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogProcessAnalysis(java.util.Map<String, ?> dialogProcessAnalysis) {
            this.dialogProcessAnalysis = dialogProcessAnalysis;
            return this;
        }
        public java.util.Map<String, ?> getDialogProcessAnalysis() {
            return this.dialogProcessAnalysis;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogSop(String dialogSop) {
            this.dialogSop = dialogSop;
            return this;
        }
        public String getDialogSop() {
            return this.dialogSop;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogSummary(String dialogSummary) {
            this.dialogSummary = dialogSummary;
            return this;
        }
        public String getDialogSummary() {
            return this.dialogSummary;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList extends TeaModel {
        /**
         * <p>Session analysis result</p>
         */
        @NameInMap("analysisResp")
        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp;

        /**
         * <p>Session creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>OSS URL for the session analysis result. The URL expires in one hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665">https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665</a></p>
         */
        @NameInMap("ossUrl")
        public String ossUrl;

        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>183764873624</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>Task execution status for session analysis.</p>
         * <ul>
         * <li><p>init means the task has not started</p>
         * </li>
         * <li><p>pending means the task is queued</p>
         * </li>
         * <li><p>running means the task is in progress</p>
         * </li>
         * <li><p>error means the task failed</p>
         * </li>
         * <li><p>success means the task completed successfully</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setAnalysisResp(GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp) {
            this.analysisResp = analysisResp;
            return this;
        }
        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp getAnalysisResp() {
            return this.analysisResp;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyData extends TeaModel {
        /**
         * <p>List of session analysis results</p>
         */
        @NameInMap("dialogAnalysisRespList")
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList;

        public static GetDialogAnalysisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyData self = new GetDialogAnalysisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyData setDialogAnalysisRespList(java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList) {
            this.dialogAnalysisRespList = dialogAnalysisRespList;
            return this;
        }
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> getDialogAnalysisRespList() {
            return this.dialogAnalysisRespList;
        }

    }

}
