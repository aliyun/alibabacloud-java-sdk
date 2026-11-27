// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolicStackRequest extends TeaModel {
    /**
     * <p>The symbol file matching information, which varies based on stackType. For js, jvm, and android-native, it is a JSON string (js and jvm must contain both version and fileName, and optionally uuid/debugId; android-native supports a single module, a modules array, and il2cppMapping). For cocoa, it is a non-JSON format (module:objectKey;...) for historical compatibility only, and it is recommended to pass it through images in the new version. If matching information is missing, the symbol is not found, or parsing fails for js, an empty result is returned. If fileInfo is missing or the symbol is not found for jvm, an empty result is returned, and it falls back to the original stack only when downstream symbolication fails.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;1.0.0&quot;,&quot;fileName&quot;:&quot;mapping.txt&quot;}</p>
     */
    @NameInMap("fileInfo")
    public String fileInfo;

    /**
     * <p>The binary image information associated with Native/Cocoa crashes. The format varies based on stackType (only electron-native uses a JSON array). For cocoa, it is a line-by-line string (each line is module:arch;uuid;loadAddress). For electron-native, it is a JSON array string (elements contain name, debug_id/debugId, or code_id/codeId, and optionally load_address/loadAddress and arch). For windows-native, it is a semicolon-separated string of debugId and debugFile (.pdb file name). For macos-native, it is a semicolon-separated string of uuid and name. If matching information is missing, the symbol file is not found, or symbolication fails, Native/Cocoa types fall back to returning the original stack lines. The following example applies only to scenarios where stackType is electron-native and cannot be directly combined with stackType=jvm in a request.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;Electron Framework&quot;,&quot;debug_id&quot;:&quot;ABCDEF01-2345-6789-ABCD-EF0123456789&quot;,&quot;code_id&quot;:&quot;CODE-1&quot;,&quot;load_address&quot;:&quot;0x0000000100000000&quot;,&quot;arch&quot;:&quot;arm64&quot;}]</p>
     */
    @NameInMap("images")
    public String images;

    /**
     * <p>The application PID. <strong>[Deprecated]</strong> The server automatically resolves this value based on the workspace and serviceId.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxojw@e3hd38hxxxx11</p>
     */
    @NameInMap("pid")
    @Deprecated
    public String pid;

    /**
     * <p>The service ID of the RUM application. This parameter is required and cannot be an empty string. It must be used together with workspace to locate the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4e5@f67890</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The original exception stack content to be symbolicated. This parameter is required and cannot be an empty string. If stackType is js, the format is &quot;line,column,rows&quot;. For other types, pass the original stack text of the corresponding platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>java.lang.NullPointerException
     *     at com.example.Main.main(Main.java:10)</p>
     */
    @NameInMap("stack")
    public String stack;

    /**
     * <p>The stack type. This parameter is required and cannot be an empty string. Valid values: js, jvm, android-native, cocoa, electron-native, windows-native, and macos-native.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jvm</p>
     */
    @NameInMap("stackType")
    public String stackType;

    /**
     * <p>The ID of the exception thread.</p>
     * 
     * <strong>example:</strong>
     * <p>thread-1</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <p>The name of the workspace to which the RUM application belongs. This parameter is required and cannot be an empty string. It must be used together with serviceId to locate the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1234567890-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetRumSymbolicStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolicStackRequest self = new GetRumSymbolicStackRequest();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolicStackRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public GetRumSymbolicStackRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    @Deprecated
    public GetRumSymbolicStackRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumSymbolicStackRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetRumSymbolicStackRequest setStack(String stack) {
        this.stack = stack;
        return this;
    }
    public String getStack() {
        return this.stack;
    }

    public GetRumSymbolicStackRequest setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }
    public String getStackType() {
        return this.stackType;
    }

    public GetRumSymbolicStackRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public GetRumSymbolicStackRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
