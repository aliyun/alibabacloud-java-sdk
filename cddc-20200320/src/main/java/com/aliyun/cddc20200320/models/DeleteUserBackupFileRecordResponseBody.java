// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DeleteUserBackupFileRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceName")
    public String instanceName;

    public static DeleteUserBackupFileRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserBackupFileRecordResponseBody self = new DeleteUserBackupFileRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserBackupFileRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserBackupFileRecordResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DeleteUserBackupFileRecordResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteUserBackupFileRecordResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
