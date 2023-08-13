// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The end date of the time range to query. Specify the date in the *yyyyMMdd* format. The time must be in UTC.</p>
     * <br>
     * <p>*   The default value of this parameter is one day before the current day.</p>
     * <p>*   The value must be earlier than the current day. The interval between the start date and the end date cannot exceed 30 days.</p>
     */
    @NameInMap("EndDt")
    public String endDt;

    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL.</p>
     * <p>*   **PolarDBMySQL**: PolarDB for MySQL.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>>  You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-china**: Chinese mainland.</p>
     * <p>*   **cn-hongkong**: China (Hong Kong).</p>
     * <p>*   **ap-southeast-1**: Singapore.</p>
     * <br>
     * <p>This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region specified by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect, and the system obtains data from the region in which the first specified instance resides.****</p>
     * <br>
     * <p>>  If your instances reside in the regions inside the Chinese mainland, set this parameter to **cn-china**.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start date of the time range to query. Specify the date in the *yyyyMMdd* format. The time must be in UTC.</p>
     * <br>
     * <p>*   The default value of this parameter is one day before the current day.</p>
     * <p>*   The value must be earlier than the current day.</p>
     */
    @NameInMap("StartDt")
    public String startDt;

    public static GetSqlOptimizeAdviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlOptimizeAdviceRequest self = new GetSqlOptimizeAdviceRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlOptimizeAdviceRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetSqlOptimizeAdviceRequest setEndDt(String endDt) {
        this.endDt = endDt;
        return this;
    }
    public String getEndDt() {
        return this.endDt;
    }

    public GetSqlOptimizeAdviceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetSqlOptimizeAdviceRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetSqlOptimizeAdviceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetSqlOptimizeAdviceRequest setStartDt(String startDt) {
        this.startDt = startDt;
        return this;
    }
    public String getStartDt() {
        return this.startDt;
    }

}
