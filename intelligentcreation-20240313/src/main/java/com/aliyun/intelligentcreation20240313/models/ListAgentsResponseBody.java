// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    @NameInMap("list")
    public java.util.List<ListAgentsResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setList(java.util.List<ListAgentsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentsResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgentsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAgentsResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>840016700254633984</p>
         */
        @NameInMap("agentId")
        public String agentId;

        @NameInMap("agentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("agentScene")
        public String agentScene;

        @NameInMap("charactersDescription")
        public String charactersDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("enableInteraction")
        public Integer enableInteraction;

        /**
         * <strong>example:</strong>
         * <p>Car</p>
         */
        @NameInMap("industry")
        public String industry;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("onlineSearch")
        public Boolean onlineSearch;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>http
         * ;//<a href="http://www.abc.com/111.mp4">www.abc.com/111.mp4</a></p>
         */
        @NameInMap("referenceUrl")
        public String referenceUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>RED_BOOK</p>
         */
        @NameInMap("textStyle")
        public String textStyle;

        /**
         * <strong>example:</strong>
         * <p>Seller</p>
         */
        @NameInMap("viewer")
        public String viewer;

        public static ListAgentsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyList self = new ListAgentsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentsResponseBodyList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentsResponseBodyList setAgentScene(String agentScene) {
            this.agentScene = agentScene;
            return this;
        }
        public String getAgentScene() {
            return this.agentScene;
        }

        public ListAgentsResponseBodyList setCharactersDescription(String charactersDescription) {
            this.charactersDescription = charactersDescription;
            return this;
        }
        public String getCharactersDescription() {
            return this.charactersDescription;
        }

        public ListAgentsResponseBodyList setEnableInteraction(Integer enableInteraction) {
            this.enableInteraction = enableInteraction;
            return this;
        }
        public Integer getEnableInteraction() {
            return this.enableInteraction;
        }

        public ListAgentsResponseBodyList setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListAgentsResponseBodyList setOnlineSearch(Boolean onlineSearch) {
            this.onlineSearch = onlineSearch;
            return this;
        }
        public Boolean getOnlineSearch() {
            return this.onlineSearch;
        }

        public ListAgentsResponseBodyList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAgentsResponseBodyList setReferenceUrl(String referenceUrl) {
            this.referenceUrl = referenceUrl;
            return this;
        }
        public String getReferenceUrl() {
            return this.referenceUrl;
        }

        public ListAgentsResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAgentsResponseBodyList setTextStyle(String textStyle) {
            this.textStyle = textStyle;
            return this;
        }
        public String getTextStyle() {
            return this.textStyle;
        }

        public ListAgentsResponseBodyList setViewer(String viewer) {
            this.viewer = viewer;
            return this;
        }
        public String getViewer() {
            return this.viewer;
        }

    }

}
