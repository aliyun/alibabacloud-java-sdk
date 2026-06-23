// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class SubmitChatQuestionRequest extends TeaModel {
    /**
     * <p>Current time</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-27 11:23:20</p>
     */
    @NameInMap("gmtService")
    public String gmtService;

    /**
     * <p>Live channel script</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>我们家的酒全都是老酒，酒厂直售【当前用户问句】，保证正儿八经的自家酿造，地址都能告诉大家，品质实实在在的有保障。我们家这款酒入口非常绵柔顺滑，酱香、粮食香、花果香层层递进，空杯留香能持续48小时，不会有上头的感觉。今天我们是厂家直销，大家平时买酒在烟酒店要经过好几个环节的中间商，每个环节都要加价，今天在这里拍下，只会让你省不少冤枉钱。如果说你拿去存酒的话， 拍蓝瓶的云端系列也可以，越存的话会越香，你拿去托人办事、请人吃饭、商务宴请、搞接待送礼，直接带白瓶云悠系列。</p>
     */
    @NameInMap("liveScriptContent")
    public String liveScriptContent;

    /**
     * <p>Enable small talk. Default is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("openSmallTalk")
    public Boolean openSmallTalk;

    /**
     * <p>Question list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("questionList")
    public java.util.List<SubmitChatQuestionRequestQuestionList> questionList;

    /**
     * <p>Request ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Session ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237645726354</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static SubmitChatQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitChatQuestionRequest self = new SubmitChatQuestionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitChatQuestionRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

    public SubmitChatQuestionRequest setLiveScriptContent(String liveScriptContent) {
        this.liveScriptContent = liveScriptContent;
        return this;
    }
    public String getLiveScriptContent() {
        return this.liveScriptContent;
    }

    public SubmitChatQuestionRequest setOpenSmallTalk(Boolean openSmallTalk) {
        this.openSmallTalk = openSmallTalk;
        return this;
    }
    public Boolean getOpenSmallTalk() {
        return this.openSmallTalk;
    }

    public SubmitChatQuestionRequest setQuestionList(java.util.List<SubmitChatQuestionRequestQuestionList> questionList) {
        this.questionList = questionList;
        return this;
    }
    public java.util.List<SubmitChatQuestionRequestQuestionList> getQuestionList() {
        return this.questionList;
    }

    public SubmitChatQuestionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitChatQuestionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class SubmitChatQuestionRequestQuestionList extends TeaModel {
        /**
         * <p>Question content</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>这是多大的体积</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Original question time</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-17 10:05:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>Reply content</p>
         * 
         * <strong>example:</strong>
         * <p>这是三升的。</p>
         */
        @NameInMap("reply")
        public String reply;

        /**
         * <p>Session ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1869300950603128834</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>Question type: PRODUCT_QA (audio submission), GOSSIP (operation submission), UNKNOWN (unknown)</p>
         * 
         * <strong>example:</strong>
         * <p>PRODUCT_QA</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Unique ID of the user asking questions in the live channel</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39485783475638465</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>Name of the user asking questions in the live channel</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>张**</p>
         */
        @NameInMap("userName")
        public String userName;

        public static SubmitChatQuestionRequestQuestionList build(java.util.Map<String, ?> map) throws Exception {
            SubmitChatQuestionRequestQuestionList self = new SubmitChatQuestionRequestQuestionList();
            return TeaModel.build(map, self);
        }

        public SubmitChatQuestionRequestQuestionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitChatQuestionRequestQuestionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SubmitChatQuestionRequestQuestionList setReply(String reply) {
            this.reply = reply;
            return this;
        }
        public String getReply() {
            return this.reply;
        }

        public SubmitChatQuestionRequestQuestionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SubmitChatQuestionRequestQuestionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitChatQuestionRequestQuestionList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SubmitChatQuestionRequestQuestionList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
