// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueRequest extends TeaModel {
    /**
     * <p>The list of department IDs. Separate multiple IDs with commas (,).</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> operation and check the <strong>DepartmentId</strong> parameter in the response to obtain the department ID.</p>
     * <blockquote>
     * <p>When this parameter is not empty:</p>
     * <ul>
     * <li>If GroupIds is not empty, the query is performed based on the skill group list corresponding to GroupIds.</li>
     * <li>If GroupIds is empty, the query is performed based on the department list corresponding to this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2332****,2334****</p>
     */
    @NameInMap("DepIds")
    public String depIds;

    /**
     * <p>The list of skill group IDs. Separate multiple IDs with commas (,).</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2717970.html">QuerySkillGroups</a> operation and check the <strong>SkillGroupId</strong> parameter in the response to obtain the skill group ID.</p>
     * <blockquote>
     * <p>When this parameter is not empty, the query is performed based on the skill group list corresponding to this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2323****,2324****</p>
     */
    @NameInMap("GroupIds")
    public String groupIds;

    /**
     * <p>The AICCS instance ID. You can obtain the instance ID from <b>Instance Management</b> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
