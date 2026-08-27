// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentSkillMetaRequest extends TeaModel {
    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>data-query-skill</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The source of the skill. Valid values:</p>
     * <ul>
     * <li>User: a skill uploaded by the user.</li>
     * <li>Agent: a skill derived from Agent analysis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("SkillFrom")
    public String skillFrom;

    /**
     * <p>The skill ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ski-04pomiln*************j0</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>data-query-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b5u96hud*************gq3</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentSkillMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentSkillMetaRequest self = new ListDataAgentSkillMetaRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentSkillMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentSkillMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentSkillMetaRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataAgentSkillMetaRequest setSkillFrom(String skillFrom) {
        this.skillFrom = skillFrom;
        return this;
    }
    public String getSkillFrom() {
        return this.skillFrom;
    }

    public ListDataAgentSkillMetaRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public ListDataAgentSkillMetaRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public ListDataAgentSkillMetaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
