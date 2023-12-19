// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class Report extends TeaModel {
    @NameInMap("FailedFiles")
    public String failedFiles;

    @NameInMap("SkippedFiles")
    public String skippedFiles;

    @NameInMap("SuccessFiles")
    public String successFiles;

    @NameInMap("TotalFiles")
    public String totalFiles;

    public static Report build(java.util.Map<String, ?> map) throws Exception {
        Report self = new Report();
        return TeaModel.build(map, self);
    }

    public Report setFailedFiles(String failedFiles) {
        this.failedFiles = failedFiles;
        return this;
    }
    public String getFailedFiles() {
        return this.failedFiles;
    }

    public Report setSkippedFiles(String skippedFiles) {
        this.skippedFiles = skippedFiles;
        return this;
    }
    public String getSkippedFiles() {
        return this.skippedFiles;
    }

    public Report setSuccessFiles(String successFiles) {
        this.successFiles = successFiles;
        return this;
    }
    public String getSuccessFiles() {
        return this.successFiles;
    }

    public Report setTotalFiles(String totalFiles) {
        this.totalFiles = totalFiles;
        return this;
    }
    public String getTotalFiles() {
        return this.totalFiles;
    }

}
