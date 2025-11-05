// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupAssociateProjectsResponseBody extends TeaModel {
    /**
     * <p>The list of workspace IDs.</p>
     */
    @NameInMap("ProjectIdList")
    public java.util.List<Long> projectIdList;

    /**
     * <p>The request ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupAssociateProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupAssociateProjectsResponseBody self = new ListResourceGroupAssociateProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupAssociateProjectsResponseBody setProjectIdList(java.util.List<Long> projectIdList) {
        this.projectIdList = projectIdList;
        return this;
    }
    public java.util.List<Long> getProjectIdList() {
        return this.projectIdList;
    }

    public ListResourceGroupAssociateProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupAssociateProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
