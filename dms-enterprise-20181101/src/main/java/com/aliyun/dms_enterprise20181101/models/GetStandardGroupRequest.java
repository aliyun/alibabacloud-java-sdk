// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStandardGroupRequest extends TeaModel {
    /**
     * <p>The security rule set ID. You can call the <a href="https://help.aliyun.com/document_detail/465940.html">ListStandardGroups</a> operation to obtain the ID of the security rule set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>242***</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetStandardGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardGroupRequest self = new GetStandardGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetStandardGroupRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
