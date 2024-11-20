// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarsRequest extends TeaModel {
    /**
     * <ul>
     * <li>The type of the digital human.</li>
     * <li>2DAvatar</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2DAvatar</p>
     */
    @NameInMap("AvatarType")
    public String avatarType;

    /**
     * <ul>
     * <li>The page number.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <ul>
     * <li>The number of entries per page.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAvatarsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarsRequest self = new ListAvatarsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvatarsRequest setAvatarType(String avatarType) {
        this.avatarType = avatarType;
        return this;
    }
    public String getAvatarType() {
        return this.avatarType;
    }

    public ListAvatarsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAvatarsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
