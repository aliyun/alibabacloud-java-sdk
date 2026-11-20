// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is not used.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("StreamlogUrl")
    public String streamlogUrl;

    /**
     * <p>The authentication token.</p>
     * 
     * <strong>example:</strong>
     * <p>ak123</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The WebSocket URL.</p>
     * 
     * <strong>example:</strong>
     * <p>wss://test.com</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>The URL used to log on to the container through Workbench. After you log on to the service instance, the returned messages use the WebSocket text message format. The message content is Base64-encoded. Refer to the following script for processing.</p>
     * <pre><code class="language-python">#!/usr/bin/env python3
     * &quot;&quot;&quot;macOS/Linux: python webshell_minimal.py \\&quot;wss://...\\&quot;; Ctrl+] disconnects.&quot;&quot;&quot;
     * import argparse
     * import base64
     * import codecs
     * import getpass
     * import json
     * import os
     * import select
     * import shutil
     * import sys
     * import termios
     * import threading
     * import tty
     * 
     * import websocket
     * 
     * 
     * def main():
     *     parser = argparse.ArgumentParser(description=__doc__)
     *     parser.add_argument(\\&quot;url\\&quot;, help=\\&quot;Url from CreateServiceInstanceToken(ActionType=WebShell)\\&quot;)
     *     args = parser.parse_args()
     *     if not sys.stdin.isatty():
     *         parser.error(\\&quot;Run from an interactive macOS/Linux terminal\\&quot;)
     *     token = os.environ.get(\\&quot;WEBSHELL_TOKEN\\&quot;) or getpass.getpass(\\&quot;Token: \\&quot;)
     *     ws = websocket.create_connection(args.url, header={\\&quot;Authorization\\&quot;: \\&quot;Bearer \\&quot; + token.strip()},
     *                                      subprotocols=[\\&quot;webtty\\&quot;], timeout=10)
     *     ws.settimeout(None)
     *     stopped = threading.Event()
     * 
     *     def receive():
     *         try:
     *             while not stopped.is_set():
     *                 message = ws.recv()  # websocket-client automatically replies to control Ping frames.
     *                 if not message:
     *                     break
     *                 if isinstance(message, str) and message[0] == \\&quot;1\\&quot;:
     *                     sys.stdout.buffer.write(base64.b64decode(message[1:], validate=True))
     *                     sys.stdout.buffer.flush()  # Preserve terminal escape sequences and UTF-8 bytes.
     *                 # \\&quot;2\\&quot; is webtty Pong; other types need no handling in this terminal client.
     *         except (websocket.WebSocketException, OSError, ValueError):
     *             pass
     *         finally:
     *             stopped.set()
     * 
     *     fd = sys.stdin.fileno()
     *     previous = termios.tcgetattr(fd)
     *     decoder = codecs.getincrementaldecoder(\\&quot;utf-8\\&quot;)()
     *     print(\\&quot;Connected. Ctrl+] disconnects; Ctrl+C is sent to the remote shell.\\&quot;, flush=True)
     *     reader = threading.Thread(target=receive, daemon=True)
     *     try:
     *         tty.setraw(fd)
     *         reader.start()
     *         size = None
     *         while not stopped.is_set():
     *             current = shutil.get_terminal_size((80, 24))
     *             if current != size:
     *                 ws.send(\\&quot;3\\&quot; + json.dumps({\\&quot;columns\\&quot;: current.columns, \\&quot;rows\\&quot;: current.lines}))
     *                 size = current
     *             if select.select([fd], [], [], 0.2)[0]:
     *                 data = os.read(fd, 4096)
     *                 if not data or b\\&quot;\\x1d\\&quot; in data:  # Ctrl+]
     *                     break
     *                 text = decoder.decode(data)  # Do not split a UTF-8 character across Text messages.
     *                 if text:
     *                     ws.send(\\&quot;1\\&quot; + text)  # Raw input, NOT base64 and NOT a JSON wrapper.
     *     finally:
     *         termios.tcsetattr(fd, termios.TCSADRAIN, previous)
     *         stopped.set()
     *         try:
     *             ws.send_close()
     *         except (websocket.WebSocketException, OSError):
     *             pass
     *         ws.shutdown()
     *         if reader.ident is not None:
     *             reader.join(timeout=1)
     *         print(\\&quot;
     * Disconnected.\\&quot;, flush=True)
     * 
     * 
     * if __name__ == \\&quot;__main__\\&quot;:
     *     try:
     *         main()
     *     except websocket.WebSocketBadStatusException as exc:
     *         sys.exit(f\\&quot;WebSocket handshake failed: HTTP {exc.status_code}\\&quot;)
     *     except (websocket.WebSocketException, OSError, UnicodeError, KeyboardInterrupt) as exc:
     *         sys.exit(f\\&quot;WebShell stopped: {type(exc).__name__}\\&quot;)
     * </code></pre>
     */
    @NameInMap("WorkbenchUrl")
    public String workbenchUrl;

    public static CreateServiceInstanceTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceTokenResponseBody self = new CreateServiceInstanceTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceInstanceTokenResponseBody setStreamlogUrl(String streamlogUrl) {
        this.streamlogUrl = streamlogUrl;
        return this;
    }
    public String getStreamlogUrl() {
        return this.streamlogUrl;
    }

    public CreateServiceInstanceTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateServiceInstanceTokenResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateServiceInstanceTokenResponseBody setWorkbenchUrl(String workbenchUrl) {
        this.workbenchUrl = workbenchUrl;
        return this;
    }
    public String getWorkbenchUrl() {
        return this.workbenchUrl;
    }

}
