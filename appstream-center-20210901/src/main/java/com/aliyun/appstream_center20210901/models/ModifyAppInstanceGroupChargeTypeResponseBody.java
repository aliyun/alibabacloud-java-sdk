// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The task information for this billing method conversion.</p>
     */
    @NameInMap("AppInstanceGroupModel")
    public ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel appInstanceGroupModel;

    /**
     * <p>The unique ID of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppInstanceGroupChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupChargeTypeResponseBody self = new ModifyAppInstanceGroupChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupChargeTypeResponseBody setAppInstanceGroupModel(ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel appInstanceGroupModel) {
        this.appInstanceGroupModel = appInstanceGroupModel;
        return this;
    }
    public ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel getAppInstanceGroupModel() {
        return this.appInstanceGroupModel;
    }

    public ModifyAppInstanceGroupChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel extends TeaModel {
        /**
         * <p>The ID of the billing conversion order task, used to associate with this conversion. It is returned only when a related order task is required and created. It does not indicate that the payment is completed or the new billing method has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>task-123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel self = new ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupChargeTypeResponseBodyAppInstanceGroupModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
