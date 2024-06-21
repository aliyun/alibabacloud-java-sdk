// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5406**</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The reason(s) to delete application.</p>
     */
    @NameInMap("DeleteReason")
    public DeleteTraceAppRequestDeleteReason deleteReason;

    /**
     * <p>The PID of the application. For more information about how to query the PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">QueryMetricByPage</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9w0sc5gxxz@edcsd447c2f****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region in which the application is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>. Valid values:</p>
     * <ul>
     * <li><code>TRACE</code>: Application Monitoring</li>
     * <li><code>RETCODE</code>: frontend monitoring</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeleteTraceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppRequest self = new DeleteTraceAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteTraceAppRequest setDeleteReason(DeleteTraceAppRequestDeleteReason deleteReason) {
        this.deleteReason = deleteReason;
        return this;
    }
    public DeleteTraceAppRequestDeleteReason getDeleteReason() {
        return this.deleteReason;
    }

    public DeleteTraceAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteTraceAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTraceAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DeleteTraceAppRequestDeleteReasonReasonIds extends TeaModel {
        /**
         * <p>The ID of the reason for deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>A description of the reason for removal.</p>
         * 
         * <strong>example:</strong>
         * <p>The function is not perfect, and the root cause of the problem cannot be located.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DeleteTraceAppRequestDeleteReasonReasonIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteTraceAppRequestDeleteReasonReasonIds self = new DeleteTraceAppRequestDeleteReasonReasonIds();
            return TeaModel.build(map, self);
        }

        public DeleteTraceAppRequestDeleteReasonReasonIds setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DeleteTraceAppRequestDeleteReasonReasonIds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteTraceAppRequestDeleteReason extends TeaModel {
        /**
         * <p>Reasons Ids.</p>
         */
        @NameInMap("ReasonIds")
        public java.util.List<DeleteTraceAppRequestDeleteReasonReasonIds> reasonIds;

        /**
         * <p>Additional remarks when none of the reasons for removal provided are met.</p>
         * 
         * <strong>example:</strong>
         * <p>The business scenario cannot be satisfied.</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static DeleteTraceAppRequestDeleteReason build(java.util.Map<String, ?> map) throws Exception {
            DeleteTraceAppRequestDeleteReason self = new DeleteTraceAppRequestDeleteReason();
            return TeaModel.build(map, self);
        }

        public DeleteTraceAppRequestDeleteReason setReasonIds(java.util.List<DeleteTraceAppRequestDeleteReasonReasonIds> reasonIds) {
            this.reasonIds = reasonIds;
            return this;
        }
        public java.util.List<DeleteTraceAppRequestDeleteReasonReasonIds> getReasonIds() {
            return this.reasonIds;
        }

        public DeleteTraceAppRequestDeleteReason setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
