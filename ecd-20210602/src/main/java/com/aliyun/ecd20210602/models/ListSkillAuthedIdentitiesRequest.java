// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSkillAuthedIdentitiesRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: enterprise edition</li>
     * <li>BUSINESS: business edition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The unique identifier of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-04rj8mzqj1fu****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static ListSkillAuthedIdentitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillAuthedIdentitiesRequest self = new ListSkillAuthedIdentitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillAuthedIdentitiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillAuthedIdentitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillAuthedIdentitiesRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public ListSkillAuthedIdentitiesRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
