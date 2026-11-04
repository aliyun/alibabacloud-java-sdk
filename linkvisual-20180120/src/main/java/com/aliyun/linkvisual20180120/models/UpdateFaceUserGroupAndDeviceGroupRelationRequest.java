// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    /**
     * <p>The control ID of the synchronization relationship between the user group and the device group. Pass the <strong>ControlId</strong> value that you obtained and saved locally when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcb2yea4ha4d****</p>
     */
    @NameInMap("ControlId")
    public String controlId;

    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. The value must be the same as the <strong>IsolationId</strong> value that you specified when you called the <a href="https://help.aliyun.com/document_detail/288342.html">AddFaceUserGroupAndDeviceGroupRelation</a> operation to add the face synchronization relationship between the user group and the device group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The face synchronization relationship. Currently, only <strong>SYNC_INFO_PICTURE</strong> is supported, which indicates that user photos and user information are synchronized.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC_INFO_PICTURE</p>
     */
    @NameInMap("Relation")
    public String relation;

    public static UpdateFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserGroupAndDeviceGroupRelationRequest self = new UpdateFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

}
