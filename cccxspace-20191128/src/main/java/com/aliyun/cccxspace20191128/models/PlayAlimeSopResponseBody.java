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
        @NameInMap("CardId")
        public String cardId;

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
        @NameInMap("Checked")
        public Boolean checked;

        @NameInMap("OptionId")
        public String optionId;

        @NameInMap("Title")
        public String title;

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
        @NameInMap("CollapseContent")
        public Boolean collapseContent;

        @NameInMap("Content")
        public String content;

        @NameInMap("HideTitle")
        public Boolean hideTitle;

        @NameInMap("Id")
        public Long id;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

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
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("Cards")
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyCards> cards;

        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraParams")
        public String extraParams;

        @NameInMap("Options")
        public java.util.List<PlayAlimeSopResponseBodyDataNodesBodyOptions> options;

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
        @NameInMap("Body")
        public PlayAlimeSopResponseBodyDataNodesBody body;

        @NameInMap("Id")
        public String id;

        @NameInMap("Title")
        public String title;

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
        @NameInMap("End")
        public Boolean end;

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
