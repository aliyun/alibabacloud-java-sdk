// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DataResultsTaskIndividualResultMapValue extends TeaModel {
    /**
     * <p>Experiment ID</p>
     * 
     * <strong>example:</strong>
     * <p>54</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    /**
     * <p>Host IP</p>
     * 
     * <strong>example:</strong>
     * <p>p-jt-waf-app1</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>Pod name</p>
     * 
     * <strong>example:</strong>
     * <p>fluxserv-6fc89b45cf-w8wq6</p>
     */
    @NameInMap("PodName")
    public String podName;

    /**
     * <p>GPU数量</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("GpuNum")
    public Integer gpuNum;

    /**
     * <p>GPU名称</p>
     * 
     * <strong>example:</strong>
     * <p>8x OAM 810 GPU</p>
     */
    @NameInMap("GpuName")
    public String gpuName;

    /**
     * <p>Whether there is a warning</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WarningFlag")
    public Boolean warningFlag;

    /**
     * <p>Warning message</p>
     * 
     * <strong>example:</strong>
     * <p>warning message</p>
     */
    @NameInMap("WarningMsg")
    public String warningMsg;

    /**
     * <p>Whether there is an error</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ErrorFlag")
    public Boolean errorFlag;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>error message</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>TFLOPS value</p>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("Tflops")
    public Double tflops;

    /**
     * <p>Throughput</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("SamplesPerSecond")
    public Double samplesPerSecond;

    public static DataResultsTaskIndividualResultMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataResultsTaskIndividualResultMapValue self = new DataResultsTaskIndividualResultMapValue();
        return TeaModel.build(map, self);
    }

    public DataResultsTaskIndividualResultMapValue setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

    public DataResultsTaskIndividualResultMapValue setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DataResultsTaskIndividualResultMapValue setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public DataResultsTaskIndividualResultMapValue setGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
        return this;
    }
    public Integer getGpuNum() {
        return this.gpuNum;
    }

    public DataResultsTaskIndividualResultMapValue setGpuName(String gpuName) {
        this.gpuName = gpuName;
        return this;
    }
    public String getGpuName() {
        return this.gpuName;
    }

    public DataResultsTaskIndividualResultMapValue setWarningFlag(Boolean warningFlag) {
        this.warningFlag = warningFlag;
        return this;
    }
    public Boolean getWarningFlag() {
        return this.warningFlag;
    }

    public DataResultsTaskIndividualResultMapValue setWarningMsg(String warningMsg) {
        this.warningMsg = warningMsg;
        return this;
    }
    public String getWarningMsg() {
        return this.warningMsg;
    }

    public DataResultsTaskIndividualResultMapValue setErrorFlag(Boolean errorFlag) {
        this.errorFlag = errorFlag;
        return this;
    }
    public Boolean getErrorFlag() {
        return this.errorFlag;
    }

    public DataResultsTaskIndividualResultMapValue setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DataResultsTaskIndividualResultMapValue setTflops(Double tflops) {
        this.tflops = tflops;
        return this;
    }
    public Double getTflops() {
        return this.tflops;
    }

    public DataResultsTaskIndividualResultMapValue setSamplesPerSecond(Double samplesPerSecond) {
        this.samplesPerSecond = samplesPerSecond;
        return this;
    }
    public Double getSamplesPerSecond() {
        return this.samplesPerSecond;
    }

}
