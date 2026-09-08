// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type.</p>
     * <p>Enumeration values:</p>
     * <p>AUDIO: Voice.</p>
     * <p>VIDEO: Video.</p>
     * <p>CHAT: Message.</p>
     * <p>ALL: All.</p>
     * 
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of skill group IDs for which data is queried. If not specified, all skill groups under the current instance are queried. The format is a JSON array string, with each array element being a skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;, &quot;skillgroup2@ccc-test&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    public static ListRealtimeSkillGroupStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeSkillGroupStatesRequest self = new ListRealtimeSkillGroupStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRealtimeSkillGroupStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRealtimeSkillGroupStatesRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListRealtimeSkillGroupStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRealtimeSkillGroupStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRealtimeSkillGroupStatesRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
