// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListFilePermissionResponseBody extends TeaModel {
    @NameInMap("FilePermissions")
    public java.util.List<FilePermissionMember> filePermissions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFilePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFilePermissionResponseBody self = new ListFilePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFilePermissionResponseBody setFilePermissions(java.util.List<FilePermissionMember> filePermissions) {
        this.filePermissions = filePermissions;
        return this;
    }
    public java.util.List<FilePermissionMember> getFilePermissions() {
        return this.filePermissions;
    }

    public ListFilePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
