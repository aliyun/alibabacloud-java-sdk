// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFileParamsRequest extends TeaModel {
    /**
     * <p>The debug identifier of the symbol file, such as a UUID or Debug ID. This parameter is required for all file types except dsym.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("debugId")
    public String debugId;

    /**
     * <p>The type of the file to upload. Valid values: sourcemap (.map), dsym (.dSYM.zip), proguard (.txt), native-symbol (.so), name-cache (.json/.txt), pdb (.pdb), sym (.sym), and symbol-zip (.zip). This parameter is used to apply for upload signature parameters. The value dimension differs from the artifactType filter parameter in the GetRumSymbolFiles query operation. Specifically, dsym (.dSYM.zip) is classified as artifactType=dsym during queries. symbol-zip (.zip) files are directly uploaded and archived with their original file names, and the current query operation does not support filtering by zip for artifactType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proguard</p>
     */
    @NameInMap("fileKind")
    public String fileKind;

    /**
     * <p>The name of the symbol file to upload. The file extension must match the fileKind.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mapping.txt</p>
     */
    @NameInMap("fileName")
    public String fileName;

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
     * <p>The version number of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1234567890-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetRumSymbolFileParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFileParamsRequest self = new GetRumSymbolFileParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFileParamsRequest setDebugId(String debugId) {
        this.debugId = debugId;
        return this;
    }
    public String getDebugId() {
        return this.debugId;
    }

    public GetRumSymbolFileParamsRequest setFileKind(String fileKind) {
        this.fileKind = fileKind;
        return this;
    }
    public String getFileKind() {
        return this.fileKind;
    }

    public GetRumSymbolFileParamsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetRumSymbolFileParamsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetRumSymbolFileParamsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetRumSymbolFileParamsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
