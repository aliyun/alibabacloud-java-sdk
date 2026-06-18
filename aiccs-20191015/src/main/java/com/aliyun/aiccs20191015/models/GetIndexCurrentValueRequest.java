// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueRequest extends TeaModel {
    /**
     * <p>List of department IDs. Separate multiple IDs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API and check the <strong>DepartmentId</strong> field in the response to obtain department IDs.</p>
     * <blockquote>
     * <p>When this parameter is not empty:  </p>
     * <ul>
     * <li>If GroupIds is not empty, the system prioritizes querying data metrics for the skill groups specified by GroupIds.  </li>
     * <li>If GroupIds is empty, the system prioritizes querying data metrics for the departments specified by this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2332****,2334****</p>
     */
    @NameInMap("DepIds")
    public String depIds;

    /**
     * <p>List of skill group IDs. Separate multiple IDs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2717970.html">QuerySkillGroups</a> API and check the <strong>SkillGroupId</strong> field in the response to obtain skill group IDs.</p>
     * <blockquote>
     * <p>When this parameter is not empty, the system prioritizes querying data metrics for the specified skill groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2323****,2324****</p>
     */
    @NameInMap("GroupIds")
    public String groupIds;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <blockquote>
     * <p>The AICCS instance ID is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIndexCurrentValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexCurrentValueRequest self = new GetIndexCurrentValueRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexCurrentValueRequest setDepIds(String depIds) {
        this.depIds = depIds;
        return this;
    }
    public String getDepIds() {
        return this.depIds;
    }

    public GetIndexCurrentValueRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public GetIndexCurrentValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
