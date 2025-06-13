// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ProcessItem extends TeaModel {
    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("DevType")
    public String devType;

    @NameInMap("Directory")
    public String directory;

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
