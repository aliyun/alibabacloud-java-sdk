// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateRestorePlanRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB for HBase Performance-enhanced Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to restore all tables. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Restores all tables in the ApsaraDB for HBase Performance-enhanced Edition cluster.</li>
     * <li><strong>false</strong>: Does not restore all tables in the ApsaraDB for HBase Performance-enhanced Edition cluster.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>true</strong>, the <strong>Tables</strong> parameter is invalid. If this parameter is set to <strong>false</strong>, the <strong>Tables</strong> parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RestoreAllTable")
    public Boolean restoreAllTable;

    /**
     * <p>Specifies whether to restore data by using the copy method. Set the value to <strong>true</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RestoreByCopy")
    public Boolean restoreByCopy;

    /**
     * <p>The point in time to which you want to restore data. The point in time must be within the recoverable time range. You can call the <a href="https://help.aliyun.com/document_detail/188365.html">DescribeRecoverableTimeRange</a> operation to query the recoverable time range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-05T05:49:42Z</p>
     */
    @NameInMap("RestoreToDate")
    public String restoreToDate;

    /**
     * <p>The table names. Specify one table name per line. Wildcards (*) are not supported.</p>
     * <ul>
     * <li>To restore to the current table, use the format: <code>namespace:table</code>. Example: <code>default:testTable</code>.</li>
     * <li>To restore to a different table, use the format: <code>namespace:table/namespace:table2</code>. Example: <code>default:testTable/default:testTable2</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test_ns:test_table/test_ns:test_table2</p>
     */
    @NameInMap("Tables")
    public String tables;

    /**
     * <p>The ID of the ApsaraDB for HBase Performance-enhanced Edition cluster to which data is restored. You can also restore data to the cluster that is currently backed up.</p>
     * <blockquote>
     * <p>The specified ApsaraDB for HBase Performance-enhanced Edition cluster and the backed-up ApsaraDB for HBase Performance-enhanced Edition cluster must meet the following requirements:<ul></p>
     * </blockquote>
     * <li>They are of the same version.</li>
     * <li>They are in the same region.</li>
     * <li>They are associated with the BDS cluster.</li></ul>.
     * 
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp169l540vc6c****</p>
     */
    @NameInMap("TargetClusterId")
    public String targetClusterId;

    public static CreateRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestorePlanRequest self = new CreateRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestorePlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRestorePlanRequest setRestoreAllTable(Boolean restoreAllTable) {
        this.restoreAllTable = restoreAllTable;
        return this;
    }
    public Boolean getRestoreAllTable() {
        return this.restoreAllTable;
    }

    public CreateRestorePlanRequest setRestoreByCopy(Boolean restoreByCopy) {
        this.restoreByCopy = restoreByCopy;
        return this;
    }
    public Boolean getRestoreByCopy() {
        return this.restoreByCopy;
    }

    public CreateRestorePlanRequest setRestoreToDate(String restoreToDate) {
        this.restoreToDate = restoreToDate;
        return this;
    }
    public String getRestoreToDate() {
        return this.restoreToDate;
    }

    public CreateRestorePlanRequest setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

    public CreateRestorePlanRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

}
