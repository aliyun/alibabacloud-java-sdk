// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token on your client and ensure that the token is unique across different requests.</p>
     * <p>The ClientToken can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the protocol service. It is displayed as the protocol service name in the console.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The description of the protocol service</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the creation request.</p>
     * <p>A dry run checks the validity of parameters and dependencies. It does not actually create the instance or incur any fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The protocol service is not created. The system checks whether required parameters are specified, the request format is valid, and business limits and dependencies are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the HTTP status code 200 is returned, but the ProtocolServiceId is empty.</li>
     * <li>false (default): performs a standard request. The instance is created directly after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The specification of the protocol service.</p>
     * <p>Valid values: General (default).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("ProtocolSpec")
    public String protocolSpec;

    /**
     * <p>The protocol type of the protocol service.</p>
     * <p>Valid values: NFS (default). Only NFSv3 protocol access is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The bandwidth of the protocol service.</p>
     * <p>Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("Throughput")
    public Integer throughput;

    /**
     * <p>The vSwitch ID of the protocol service.</p>
     * <p>Do not set this field when the storage redundancy type of the file system is zone-redundant storage (ZRS). In other cases, this field is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2vc3c2lybvdllxyq4****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the protocol service. It must be the same as the VPC of the file system.</p>
     * <p>Do not set this field when the storage redundancy type of the file system is zone-redundant storage (ZRS). In other cases, this field is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2vct297b8157bth9z****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateProtocolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolServiceRequest self = new CreateProtocolServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtocolServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProtocolServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProtocolServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateProtocolServiceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateProtocolServiceRequest setProtocolSpec(String protocolSpec) {
        this.protocolSpec = protocolSpec;
        return this;
    }
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    public CreateProtocolServiceRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateProtocolServiceRequest setThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }
    public Integer getThroughput() {
        return this.throughput;
    }

    public CreateProtocolServiceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateProtocolServiceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
