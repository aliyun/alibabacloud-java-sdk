// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBriefSkillGroupsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The media type. The default value is AUDIO. Other valid values include CHAT and VIDEO.</p>
     * 
     * <strong>example:</strong>
     * <p>CHAT</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The page number for paging, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size for paging, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Perform fuzzy matching based on the skill group name or display name. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListBriefSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBriefSkillGroupsRequest self = new ListBriefSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListBriefSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBriefSkillGroupsRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListBriefSkillGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBriefSkillGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBriefSkillGroupsRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
