// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSecureSkillIdentitiesRequest extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: Enterprise edition.</li>
     * <li>BUSINESS: Business edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    public static ListSecureSkillIdentitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecureSkillIdentitiesRequest self = new ListSecureSkillIdentitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListSecureSkillIdentitiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecureSkillIdentitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSecureSkillIdentitiesRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

}
