// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QuerySkillGroupsRequest extends TeaModel {
    /**
     * <p>The channel type of the skill group. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: All skill groups are returned.</li>
     * <li><strong>1</strong>: Hotline skill group.</li>
     * <li><strong>2</strong>: Online skill group.</li>
     * <li><strong>3</strong>: Online + hotline skill group.</li>
     * <li><strong>4</strong>: Ticket skill group.</li>
     * <li><strong>5</strong>: Hotline + ticket skill group.</li>
     * <li><strong>6</strong>: Online + ticket skill group.</li>
     * <li><strong>7</strong>: Online + hotline + ticket skill group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChannelType")
    public Integer channelType;

    /**
     * <p>The unique ID of the client request. Used for idempotence verification. You can use a UUID to generate this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-****-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1023****</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The ID of the AICCS instance.
     * You can obtain the instance ID from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuerySkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySkillGroupsRequest self = new QuerySkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySkillGroupsRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QuerySkillGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QuerySkillGroupsRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public QuerySkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySkillGroupsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySkillGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
