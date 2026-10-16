// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest extends TeaModel {
    /**
     * <p>The ID of the target NAS access point. This parameter corresponds to the server and fileSystemId parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-0123456789abcdef0</p>
     */
    @NameInMap("accessPointId")
    public String accessPointId;

    /**
     * <p>The ID of the NAS file system to which the target access point belongs. This parameter corresponds to the server and accessPointId parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789</p>
     */
    @NameInMap("fileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the target access point. Obtain this value from the DomainName field in the NAS ListAccessPoints response. Do not include the protocol, port, or path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("server")
    public String server;

    public static GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest self = new GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

}
