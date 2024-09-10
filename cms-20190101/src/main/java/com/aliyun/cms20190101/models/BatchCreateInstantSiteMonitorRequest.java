// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The site monitoring tasks.</p>
     * <blockquote>
     * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> taskList;

    public static BatchCreateInstantSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateInstantSiteMonitorRequest self = new BatchCreateInstantSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateInstantSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchCreateInstantSiteMonitorRequest setTaskList(java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<BatchCreateInstantSiteMonitorRequestTaskList> getTaskList() {
        return this.taskList;
    }

    public static class BatchCreateInstantSiteMonitorRequestTaskList extends TeaModel {
        /**
         * <p>The URL or IP address that is monitored by the task.</p>
         * <blockquote>
         * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
         * <p>The value is a <code>JSON array</code>. Example: <code>{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}</code>. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
         * <p>For information about how to obtain detection points, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
         */
        @NameInMap("IspCities")
        public String ispCities;

        /**
         * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time_out&quot;:5000}</p>
         */
        @NameInMap("OptionsJson")
        public String optionsJson;

        /**
         * <p>The name of the site monitoring task.</p>
         * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HangZhou_ECS1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the site monitoring task.</p>
         * <p>Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
         * <blockquote>
         * <p> You must create at least one site monitoring task. You must specify all of the <code>Address</code>, <code>TaskName</code>, and <code>TaskType</code> parameters in each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static BatchCreateInstantSiteMonitorRequestTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateInstantSiteMonitorRequestTaskList self = new BatchCreateInstantSiteMonitorRequestTaskList();
            return TeaModel.build(map, self);
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setIspCities(String ispCities) {
            this.ispCities = ispCities;
            return this;
        }
        public String getIspCities() {
            return this.ispCities;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setOptionsJson(String optionsJson) {
            this.optionsJson = optionsJson;
            return this;
        }
        public String getOptionsJson() {
            return this.optionsJson;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public BatchCreateInstantSiteMonitorRequestTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
