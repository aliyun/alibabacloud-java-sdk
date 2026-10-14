// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ProcessItem extends TeaModel {
    /**
     * <p>The bundle identity (Bundle ID) of the application to which the process belongs. The example value com.apple.Terminal is the Bundle ID of the macOS terminal application.</p>
     * 
     * <strong>example:</strong>
     * <p>com.apple.Terminal</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The operating system type of the user terminal device to which the process belongs. Valid values:</p>
     * <ul>
     * <li>windows: Windows operating system</li>
     * <li>macOS: macOS operating system</li>
     * <li>linux: Linux operating system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>macOS</p>
     */
    @NameInMap("DevType")
    public String devType;

    /**
     * <p>The process folder path.</p>
     * 
     * <strong>example:</strong>
     * <p>/System/Applications/Utilities/Terminal.app/Contents/MacOS</p>
     */
    @NameInMap("Directory")
    public String directory;

    /**
     * <p>The process name.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminal</p>
     */
    @NameInMap("Process")
    public String process;

    public static ProcessItem build(java.util.Map<String, ?> map) throws Exception {
        ProcessItem self = new ProcessItem();
        return TeaModel.build(map, self);
    }

    public ProcessItem setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public ProcessItem setDevType(String devType) {
        this.devType = devType;
        return this;
    }
    public String getDevType() {
        return this.devType;
    }

    public ProcessItem setDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    public String getDirectory() {
        return this.directory;
    }

    public ProcessItem setProcess(String process) {
        this.process = process;
        return this;
    }
    public String getProcess() {
        return this.process;
    }

}
