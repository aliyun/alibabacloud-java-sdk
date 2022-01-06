// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PlayAlimeSopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PlayAlimeSopResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PlayAlimeSopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlayAlimeSopResponseBody self = new PlayAlimeSopResponseBody();
        return TeaModel.build(map, self);
    }

    public PlayAlimeSopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PlayAlimeSopResponseBody setData(PlayAlimeSopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PlayAlimeSopResponseBodyData getData() {
        return this.data;
    }

    public PlayAlimeSopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PlayAlimeSopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlayAlimeSopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitPlayAlimeSopResponseBodyData extends TeaModel {
        // 请求的uuid
        @NameInMap("Uuid")
        public String uuid;

        public static InitPlayAlimeSopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitPlayAlimeSopResponseBodyData self = new InitPlayAlimeSopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitPlayAlimeSopResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class PlayAlimeSopResponseBodyDataNodesBodyCards extends TeaModel {
        // 卡片id
        @NameInMap("CardId")
        public String cardId;

        // 卡片类型
        @NameInMap("Type")
        public String type;

        public static PlayAlimeSopResponseBodyDataNodesBodyCards build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyDataNodesBodyCards self = new PlayAlimeSopResponseBodyDataNodesBodyCards();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyDataNodesBodyCards setCardId(String cardId) {
            this.cardId = cardId;
            return this;
        }
        public String getCardId() {
            return this.cardId;
        }

        public PlayAlimeSopResponseBodyDataNodesBodyCards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PlayAlimeSopResponseBodyDataNodesBodyOptions extends TeaModel {
        // 选项是否默认选中
        @NameInMap("Checked")
        public Boolean checked;

        // 选项id
        @NameInMap("OptionId")
        public String optionId;

        // 选项标题
        @NameInMap("Title")
        public String title;

        // 选项值
        @NameInMap("Value")
        public String value;

        public static PlayAlimeSopResponseBodyDataNodesBodyOptions build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyDataNodesBodyOptions self = new PlayAlimeSopResponseBodyDataNodesBodyOptions();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyDataNodesBodyOptions setChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }
        public Boolean getChecked() {
            return this.checked;
        }

        public PlayAlimeSopResponseBodyDataNodesBodyOptions setOptionId(String optionId) {
            this.optionId = optionId;
            return this;
        }
        public String getOptionId() {
            return this.optionId;
        }

        public PlayAlimeSopResponseBodyDataNodesBodyOptions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PlayAlimeSopResponseBodyDataNodesBodyOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PlayAlimeSopResponseBodyDataNodesBodySections extends TeaModel {
        // 是否折叠答案
        @NameInMap("CollapseContent")
        public Boolean collapseContent;

        // 答案内容（可以是html结构体）
        @NameInMap("Content")
        public String content;

        // 是否隐藏标题
        @NameInMap("HideTitle")
        public Boolean hideTitle;

        // 区块id
        @NameInMap("Id")
        public Long id;

        // 知识标题
        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        // 区块标题
        @NameInMap("Title")
        public String title;

        public static PlayAlimeSopResponseBodyDataNodesBodySections build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyDataNodesBodySections self = new PlayAlimeSopResponseBodyDataNodesBodySections();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setCollapseContent(Boolean collapseContent) {
            this.collapseContent = collapseContent;
            return this;
        }
        public Boolean getCollapseContent() {
            return this.collapseContent;
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setHideTitle(Boolean hideTitle) {
            this.hideTitle = hideTitle;
            return this;
        }
        public Boolean getHideTitle() {
            return this.hideTitle;
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public PlayAlimeSopResponseBodyDataNodesBodySections setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class PlayAlimeSopResponseBodyDataNodesBody extends TeaModel {
        // 选择器关键单据号
        @NameInMap("BizCode")
        public String bizCode;

        // 卡片列表
        @NameInMap("Cards")
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyCards> cards;

        // 节点code
        @NameInMap("Code")
        public String code;

        // 选择器扩展参数
        @NameInMap("ExtraParams")
        public String extraParams;

        // 单选器选项列表
        @NameInMap("Options")
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyOptions> options;

        // 答案区块
        @NameInMap("Sections")
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodySections> sections;

        public static PlayAlimeSopResponseBodyDataNodesBody build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyDataNodesBody self = new PlayAlimeSopResponseBodyDataNodesBody();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyDataNodesBody setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public PlayAlimeSopResponseBodyDataNodesBody setCards(java.util.List<PlayAlimeSopResponseBodyDataNodesBodyCards> cards) {
            this.cards = cards;
            return this;
        }
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyCards> getCards() {
            return this.cards;
        }

        public PlayAlimeSopResponseBodyDataNodesBody setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PlayAlimeSopResponseBodyDataNodesBody setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public PlayAlimeSopResponseBodyDataNodesBody setOptions(java.util.List<PlayAlimeSopResponseBodyDataNodesBodyOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyOptions> getOptions() {
            return this.options;
        }

        public PlayAlimeSopResponseBodyDataNodesBody setSections(java.util.List<PlayAlimeSopResponseBodyDataNodesBodySections> sections) {
            this.sections = sections;
            return this;
        }
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodySections> getSections() {
            return this.sections;
        }

    }

    public static class PlayAlimeSopResponseBodyDataNodes extends TeaModel {
        // 节点内容
        @NameInMap("Body")
        public PlayAlimeSopResponseBodyDataNodesBody body;

        // 节点id
        @NameInMap("Id")
        public String id;

        // 节点标题
        @NameInMap("Title")
        public String title;

        // 节点类别
        @NameInMap("Type")
        public String type;

        public static PlayAlimeSopResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyDataNodes self = new PlayAlimeSopResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyDataNodes setBody(PlayAlimeSopResponseBodyDataNodesBody body) {
            this.body = body;
            return this;
        }
        public PlayAlimeSopResponseBodyDataNodesBody getBody() {
            return this.body;
        }

        public PlayAlimeSopResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlayAlimeSopResponseBodyDataNodes setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PlayAlimeSopResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PlayAlimeSopResponseBodyData extends TeaModel {
        // 整个流程是否结束
        @NameInMap("End")
        public Boolean end;

        // 展示节点
        @NameInMap("Nodes")
        public java.util.List<PlayAlimeSopResponseBodyDataNodes> nodes;

        public static PlayAlimeSopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PlayAlimeSopResponseBodyData self = new PlayAlimeSopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PlayAlimeSopResponseBodyData setEnd(Boolean end) {
            this.end = end;
            return this;
        }
        public Boolean getEnd() {
            return this.end;
        }

        public PlayAlimeSopResponseBodyData setNodes(java.util.List<PlayAlimeSopResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<PlayAlimeSopResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
