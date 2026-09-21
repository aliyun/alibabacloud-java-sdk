// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSkillReferencesResponseBody extends TeaModel {
    /**
     * <p>The skill reference relationship data returned by the paged query. The data is returned with paging.</p>
     */
    @NameInMap("data")
    public ListSkillReferencesResponseBodyData data;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>5C6D9E10-1234-5678-9ABC-DEF012345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSkillReferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillReferencesResponseBody self = new ListSkillReferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillReferencesResponseBody setData(ListSkillReferencesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillReferencesResponseBodyData getData() {
        return this.data;
    }

    public ListSkillReferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSkillReferencesResponseBodyDataPageItems extends TeaModel {
        /**
         * <p>The ID of the referencing entity (the identifier of the Agent or AgentSpec).</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1234567890abcdef</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The type of the referencing entity. Valid values: AGENT and AGENTSPEC.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("ownerType")
        public String ownerType;

        /**
         * <p>The version of the referencing entity.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("ownerVersion")
        public String ownerVersion;

        /**
         * <p>The reference selector type. Valid values: LABEL and VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("selectorType")
        public String selectorType;

        /**
         * <p>The reference selector value, such as latest, a named label, HEAD, or a specific version.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("selectorValue")
        public String selectorValue;

        /**
         * <p>The name of the referenced skill.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The workspace ID to which the reference belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListSkillReferencesResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListSkillReferencesResponseBodyDataPageItems self = new ListSkillReferencesResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListSkillReferencesResponseBodyDataPageItems setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListSkillReferencesResponseBodyDataPageItems setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ListSkillReferencesResponseBodyDataPageItems setOwnerVersion(String ownerVersion) {
            this.ownerVersion = ownerVersion;
            return this;
        }
        public String getOwnerVersion() {
            return this.ownerVersion;
        }

        public ListSkillReferencesResponseBodyDataPageItems setSelectorType(String selectorType) {
            this.selectorType = selectorType;
            return this;
        }
        public String getSelectorType() {
            return this.selectorType;
        }

        public ListSkillReferencesResponseBodyDataPageItems setSelectorValue(String selectorValue) {
            this.selectorValue = selectorValue;
            return this;
        }
        public String getSelectorValue() {
            return this.selectorValue;
        }

        public ListSkillReferencesResponseBodyDataPageItems setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListSkillReferencesResponseBodyDataPageItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListSkillReferencesResponseBodyData extends TeaModel {
        /**
         * <p>The list of skill reference relationships on the current page.</p>
         */
        @NameInMap("pageItems")
        public java.util.List<ListSkillReferencesResponseBodyDataPageItems> pageItems;

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of available pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("pagesAvailable")
        public Integer pagesAvailable;

        /**
         * <p>The total number of reference relationships that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListSkillReferencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillReferencesResponseBodyData self = new ListSkillReferencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillReferencesResponseBodyData setPageItems(java.util.List<ListSkillReferencesResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListSkillReferencesResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListSkillReferencesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillReferencesResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListSkillReferencesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
