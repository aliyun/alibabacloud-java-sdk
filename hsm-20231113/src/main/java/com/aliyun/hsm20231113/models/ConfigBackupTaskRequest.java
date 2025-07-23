// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigBackupTaskRequest extends TeaModel {
    /**
     * <p>The backup time in the 24-hour format. Valid values: 1 to 24.</p>
     * <p>Enumeration values:</p>
     * <ul>
     * <li>0</li>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * <li>6</li>
     * <li>7</li>
     * <li>8</li>
     * <li>9</li>
     * <li>10</li>
     * <li>11</li>
     * <li>12</li>
     * <li>13</li>
     * <li>14</li>
     * <li>15</li>
     * <li>16</li>
     * <li>17</li>
     * <li>18</li>
     * <li>19</li>
     * <li>20</li>
     * <li>21</li>
     * <li>22</li>
     * <li>23</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("BackupHourInDay")
    public Long backupHourInDay;

    /**
     * <p>The ID of the backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-173620705****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The automatic backup cycle. Unit: days. Valid values: 1, 3, 7, and 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BackupPeriod")
    public Long backupPeriod;

    /**
     * <p>The IDs of images for which the manual backup mode is updated to the automatic backup mode.</p>
     */
    @NameInMap("Manual2PeriodicList")
    public java.util.List<String> manual2PeriodicList;

    /**
     * <p>The IDs of images for which the automatic backup mode is updated to the manual backup mode.</p>
     */
    @NameInMap("Periodic2ManualList")
    public java.util.List<String> periodic2ManualList;

    public static ConfigBackupTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigBackupTaskRequest self = new ConfigBackupTaskRequest();
        return TeaModel.build(map, self);
    }

    public ConfigBackupTaskRequest setBackupHourInDay(Long backupHourInDay) {
        this.backupHourInDay = backupHourInDay;
        return this;
    }
    public Long getBackupHourInDay() {
        return this.backupHourInDay;
    }

    public ConfigBackupTaskRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ConfigBackupTaskRequest setBackupPeriod(Long backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public Long getBackupPeriod() {
        return this.backupPeriod;
    }

    public ConfigBackupTaskRequest setManual2PeriodicList(java.util.List<String> manual2PeriodicList) {
        this.manual2PeriodicList = manual2PeriodicList;
        return this;
    }
    public java.util.List<String> getManual2PeriodicList() {
        return this.manual2PeriodicList;
    }

    public ConfigBackupTaskRequest setPeriodic2ManualList(java.util.List<String> periodic2ManualList) {
        this.periodic2ManualList = periodic2ManualList;
        return this;
    }
    public java.util.List<String> getPeriodic2ManualList() {
        return this.periodic2ManualList;
    }

}
