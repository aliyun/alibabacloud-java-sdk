// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    /**
     * <p>The control ID of the synchronization relationship between the user group and the device group. Set this parameter to the value of <strong>ControlId</strong> that you obtained and saved locally when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcb2yea4ha4d****</p>
     */
    @NameInMap("ControlId")
    public String controlId;

    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Set this parameter to the same value of <strong>IsolationId</strong> that you specified when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    public static DeleteFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupAndDeviceGroupRelationRequest self = new DeleteFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}
