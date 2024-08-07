// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The end date of the time range to query. Specify the date in the <em>yyyyMMdd</em> format. The time must be in UTC.</p>
     * <ul>
     * <li>The default value of this parameter is one day before the current day.</li>
     * <li>The value must be earlier than the current day. The interval between the start date and the end date cannot exceed 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20210917</p>
     */
    @NameInMap("EndDt")
    public String endDt;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL.</li>
     * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You must specify the instance ID only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-china</strong>: Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * <p>This parameter takes effect only if <strong>InstanceIds</strong> is left empty. If you leave <strong>InstanceIds</strong> empty, the system obtains data from the region specified by <strong>Region</strong>. By default, Region is set to <strong>cn-china</strong>. If you specify <strong>InstanceIds</strong>, <strong>Region</strong> does not take effect, and the system obtains data from the region in which the first specified instance resides.****</p>
     * <blockquote>
     * <p> If your instances reside in the regions inside the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-china</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start date of the time range to query. Specify the date in the <em>yyyyMMdd</em> format. The time must be in UTC.</p>
     * <ul>
     * <li>The default value of this parameter is one day before the current day.</li>
     * <li>The value must be earlier than the current day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20210916</p>
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
