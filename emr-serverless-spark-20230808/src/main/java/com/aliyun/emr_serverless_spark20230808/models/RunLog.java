// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class RunLog extends TeaModel {
    @NameInMap("driverStartup")
    public String driverStartup;

    @NameInMap("driverStdError")
    public String driverStdError;

    @NameInMap("driverStdOut")
    public String driverStdOut;

    @NameInMap("driverSyslog")
    public String driverSyslog;

    public static RunLog build(java.util.Map<String, ?> map) throws Exception {
        RunLog self = new RunLog();
        return TeaModel.build(map, self);
    }

    public RunLog setDriverStartup(String driverStartup) {
        this.driverStartup = driverStartup;
        return this;
    }
    public String getDriverStartup() {
        return this.driverStartup;
    }

    public RunLog setDriverStdError(String driverStdError) {
        this.driverStdError = driverStdError;
        return this;
    }
    public String getDriverStdError() {
        return this.driverStdError;
    }

    public RunLog setDriverStdOut(String driverStdOut) {
        this.driverStdOut = driverStdOut;
        return this;
    }
    public String getDriverStdOut() {
        return this.driverStdOut;
    }

    public RunLog setDriverSyslog(String driverSyslog) {
        this.driverSyslog = driverSyslog;
        return this;
    }
    public String getDriverSyslog() {
        return this.driverSyslog;
    }

}
