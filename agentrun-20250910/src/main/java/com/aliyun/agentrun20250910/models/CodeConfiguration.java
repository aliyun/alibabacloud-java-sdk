// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeConfiguration extends TeaModel {
    /**
     * <p>代码包的CRC-64校验值。如果提供了checksum，则函数计算会校验代码包的checksum是否和提供的一致</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <p>在运行时中运行的命令（例如：[&quot;python&quot;]）</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>代码运行时的编程语言，如 python3、nodejs 等</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>智能体代码ZIP包的Base64编码</p>
     * 
     * <strong>example:</strong>
     * <p>UEsDBAoAAAAAANF</p>
     */
    @NameInMap("zipFile")
    public String zipFile;

    public static CodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CodeConfiguration self = new CodeConfiguration();
        return TeaModel.build(map, self);
    }

    public CodeConfiguration setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public CodeConfiguration setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public CodeConfiguration setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CodeConfiguration setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
