// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see [SearchTraceAppByName](~~130676~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeleteReason")
    public DeleteTraceAppRequestDeleteReason deleteReason;

    /**
     * <p>The PID of the application that you want to delete. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see [SearchTraceAppByName](~~130676~~). Valid values:</p>
     * <br>
     * <p>*   `TRACE`: application monitoring</p>
     * <p>*   `RETCODE`: frontend monitoring</p>
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
        @NameInMap("Id")
        public Integer id;

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
        @NameInMap("ReasonIds")
        public java.util.List<DeleteTraceAppRequestDeleteReasonReasonIds> reasonIds;

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
