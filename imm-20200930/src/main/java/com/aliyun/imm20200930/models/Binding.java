// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Binding extends TeaModel {
    /**
     * <p>The RFC3339Nano timestamp when the OSS bucket was bound to the dataset.</p>
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
     * <p>The type of the scan. Valid values:</p>
     * <ul>
     * <li>FullScanning</li>
     * <li>IncrementalScanning</li>
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
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The status of the binding between the dataset and the OSS bucket. Valid values:</p>
     * <ul>
     * <li>Ready: IMM is ready to create the binding.</li>
     * <li>Stopped: The binding creation is suspended.</li>
     * <li>Running: The binding is running.</li>
     * <li>Retrying: IMM is retrying the binding.</li>
     * <li>Failed: The binding failed.</li>
     * <li>Deleted: The binding is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The URI of the OSS bucket to which the dataset is bound.</p>
     * <p>The URI is in the <code>oss://${bucketname}</code> format, where <code>bucketname</code> is the name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket</p>
     */
    @NameInMap("URI")
    public String URI;

    /**
     * <p>The RFC3339Nano timestamp when the binding was modified.</p>
     * <blockquote>
     * <p> If you never suspend or retry the binding between the dataset and the OSS bucket after you complete the binding, the value of UpdateTime is the same as that of CreateTime.</p>
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
