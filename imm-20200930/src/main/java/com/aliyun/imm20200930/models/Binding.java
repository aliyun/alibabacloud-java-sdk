// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Binding extends TeaModel {
    /**
     * <p>The timestamp when the binding between the dataset and the OSS bucket was created. The format is RFC3339Nano.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The scan type. Valid values:</p>
     * <ul>
     * <li><p>FullScanning: A full scan is in progress.</p>
     * </li>
     * <li><p>IncrementalScanning: An incremental scan is in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullScanning</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Reason</p>
     * 
     * <strong>example:</strong>
     * <p>pause usage</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The state of the binding between the dataset and the OSS bucket. Valid values:</p>
     * <ul>
     * <li><p>Ready: The binding is being prepared after it is created.</p>
     * </li>
     * <li><p>Stopped: The binding is paused.</p>
     * </li>
     * <li><p>Running: The binding is running.</p>
     * </li>
     * <li><p>Retrying: The binding is being retried after it is created.</p>
     * </li>
     * <li><p>Failed: The binding failed to be created.</p>
     * </li>
     * <li><p>Deleted: The binding is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The URI of the Object Storage Service (OSS) bucket attached to the dataset.</p>
     * <p>The format of an OSS bucket URI is <code>oss://${bucketname}</code>. The <code>bucketname</code> is the name of an OSS bucket that is in the same region as the current project.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket</p>
     */
    @NameInMap("URI")
    public String URI;

    /**
     * <p>The timestamp when the binding between the dataset and the OSS bucket was last modified. The format is RFC3339Nano.</p>
     * <blockquote>
     * <p>After a binding is created, if the binding has not been paused or restarted, this timestamp is the same as the creation timestamp.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Binding build(java.util.Map<String, ?> map) throws Exception {
        Binding self = new Binding();
        return TeaModel.build(map, self);
    }

    public Binding setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Binding setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Binding setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public Binding setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Binding setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Binding setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Binding setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public Binding setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
