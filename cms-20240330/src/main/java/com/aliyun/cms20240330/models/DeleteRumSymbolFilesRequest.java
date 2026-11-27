// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteRumSymbolFilesRequest extends TeaModel {
    /**
     * <p>The list of object paths of the symbol files to delete. This parameter is required and cannot be an empty array. Set the value to the artifactPath returned by GetRumSymbolFiles. Up to 1,000 paths are supported per call. Only user-uploaded symbol files under the current application can be deleted. System symbol files cannot be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;user/workspace/service-id/3.0.0/build-1/new-app.map&quot;]</p>
     */
    @NameInMap("filePaths")
    public java.util.List<String> filePaths;

    /**
     * <p>The ID of the RUM application service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4e5@f67890</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1234567890-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DeleteRumSymbolFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumSymbolFilesRequest self = new DeleteRumSymbolFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRumSymbolFilesRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    public DeleteRumSymbolFilesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DeleteRumSymbolFilesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
