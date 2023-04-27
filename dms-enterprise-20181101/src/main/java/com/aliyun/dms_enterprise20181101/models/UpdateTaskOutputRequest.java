// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskOutputRequest extends TeaModel {
    /**
     * <p>## Single-instance SQL assignment</p>
     * <br>
     * <p>- Example of NodeOutput:```</p>
     * <p>Variable extraction settings</p>
     * <p>             </p>
     * <p>                "row":0, // Rows. -1 indicates all rows.</p>
     * <p>                "column":-1, // Columns. -1 indicates all columns.</p>
     * <p>                 </p>
     * <p>                Delimiter</p>
     * <p>                If you select all rows or columns, you must specify a connector. The returned value of the variable is a string.</p>
     * <p>                 </p>
     * <p>                  </p>
     * <p>             </p>
     * <p>             </p>
     * <p>              </p>
     * <p>            "variableName":"var", // Variable name</p>
     * <p>            "description":"For demo" // Variable description</p>
     * <p>```</p>
     * <br>
     * <br>
     * <p>## Script code /ECS remote command</p>
     * <br>
     * <p>- Example of NodeOutput:```</p>
     * <p>"extractMethod":"json", // JSON</p>
     * <p>            "variableName":"var", // Variable name</p>
     * <p>            "description":"demo desc" // Variable description</p>
     * <p>```</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Updates the output variables for a specified task node.</p>
     */
    @NameInMap("NodeOutput")
    public String nodeOutput;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateTaskOutput**.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskOutputRequest self = new UpdateTaskOutputRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskOutputRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateTaskOutputRequest setNodeOutput(String nodeOutput) {
        this.nodeOutput = nodeOutput;
        return this;
    }
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    public UpdateTaskOutputRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
